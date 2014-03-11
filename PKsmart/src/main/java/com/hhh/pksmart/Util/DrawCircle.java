package com.hhh.pksmart.Util;

import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.SurfaceView;

import com.hhh.pksmart.Components.Line;
import com.hhh.pksmart.Interfaces.Shape;
/**
 * Created by kurt on 2/20/14.
 */
public class DrawCircle extends CustomDraw {
    private RectF rf;
    @Override
    public void draw(SurfaceView surfaceView,Shape circle, int styleType) {
        this.surfaceHolder = surfaceView.getHolder();
        this.styleType = styleType;

    }

    @Override
    public void run() {
        surfaceHolder.setFormat(PixelFormat.TRANSPARENT);
        Canvas canvas = surfaceHolder.lockCanvas();
        //create style(paint)
        StyleFactory styleFactory = new StyleFactory();
        paint = styleFactory.createStyle(styleType,canvas);
        //draw
        canvas.drawPaint(paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        //canvas.drawLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY(), paint);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }
}

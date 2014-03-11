package com.hhh.pksmart.Util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.hhh.pksmart.Components.Line;
import com.hhh.pksmart.Interfaces.Shape;
/**
 * Created by kurt on 2/20/14.
 */
public class DrawLine extends CustomDraw {
    private Line line;
    private SurfaceHolder surfaceHolder;
    @Override
    public void draw(SurfaceView surfaceView, Shape line, int styleType) {
        this.surfaceHolder = surfaceView.getHolder();
        this.surfaceHolder.setFormat(PixelFormat.TRANSLUCENT);
        this.line = (Line)line;
        this.styleType = styleType;
    }

    @Override
    public void run() {
        //surfaceHolder.setFormat(PixelFormat.TRANSPARENT);
        Canvas canvas = surfaceHolder.lockCanvas();
        //create style(paint)
        StyleFactory styleFactory = new StyleFactory();
        paint = styleFactory.createStyle(styleType,canvas);

        canvas.drawLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY(), paint);
        surfaceHolder.unlockCanvasAndPost(canvas);

    }
}

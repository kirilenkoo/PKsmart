package com.hhh.pksmart.Util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import com.hhh.pksmart.Components.Line;
import com.hhh.pksmart.Interfaces.Shape;

/**
 * Created by kurt on 2/21/14.
 */
public class DrawLineOnView extends CustomDrawOnView {
    @Override
    void draw(Canvas canvas, Shape shape, int styleType) {
        Log.d("drawLine",canvas.toString());
        StyleFactory styleFactory = new StyleFactory();
        Paint paint = styleFactory.createStyle(3,canvas);
        Line line = (Line)shape;
        Log.d("drawLine",line.getStartX()+":"+line.getEndX());
        canvas.drawLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY(), paint);
    }
}

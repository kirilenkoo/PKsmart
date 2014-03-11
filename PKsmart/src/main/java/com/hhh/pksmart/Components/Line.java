package com.hhh.pksmart.Components;



import android.graphics.Canvas;
import android.view.SurfaceView;

import com.hhh.pksmart.Interfaces.Shape;
import com.hhh.pksmart.Util.CustomDrawContext;
import com.hhh.pksmart.Util.Storage;

/**
 * Created by kurt on 2/19/14.
 */
public class Line implements Shape {
    float startX,startY,endX,endY;

    public float getEndY() {
        return endY;
    }

    public void setEndY(float endY) {
        this.endY = endY;
    }

    public float getEndX() {
        return endX;
    }

    public void setEndX(float endX) {
        this.endX = endX;
    }

    public float getStartX() {
        return startX;
    }

    public void setStartX(float startX) {
        this.startX = startX;
    }

    public float getStartY() {
        return startY;
    }

    public void setStartY(float startY) {
        this.startY = startY;
    }

    public Line(float x0, float y0, float x1, float y1) {
        startX = x0;
        startY = y0;
        endX = x1;
        endY = y1;
    }

    @Override
    public void draw(SurfaceView surfaceView, int styleType) {
        CustomDrawContext customDrawContext = new CustomDrawContext(1);
        customDrawContext.drawExecute(surfaceView,this,styleType);
    }

    @Override
    public void drawOnView(Canvas canvas, int styleType) {
        CustomDrawContext customDrawContext = new CustomDrawContext(3);
        customDrawContext.drawOnViewExecute(canvas, this, 1);
    }
}

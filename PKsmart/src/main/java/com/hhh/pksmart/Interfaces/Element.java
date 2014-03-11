package com.hhh.pksmart.Interfaces;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceView;

/**
 * Created by kurt on 2/19/14.
 */
public interface Element {
    void drawElement(MotionEvent e1, MotionEvent e2,SurfaceView surfaceView, int styleType);
    void autodrawElement(SurfaceView surfaceView, int styleType);
    void drawElementOnView(Canvas canvas, int styleType);
    void setMotionEvent1(MotionEvent motionEvent1);
    void setMotionEvent2(MotionEvent motionEvent2);
    void setMotionXY(float m1x, float m1y, float m2x, float m2y);
}

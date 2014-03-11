package com.hhh.pksmart.Interfaces;

import android.graphics.Canvas;
import android.view.SurfaceView;

/**
 * Created by kurt on 2/19/14.
 */
public interface Shape {
    void draw(SurfaceView surfaceView,int styleType);
    void drawOnView(Canvas canvas, int styleType);
}

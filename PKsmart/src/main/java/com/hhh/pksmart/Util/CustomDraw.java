package com.hhh.pksmart.Util;

import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.hhh.pksmart.Interfaces.Shape;

/**
 * Created by kurt on 2/20/14.
 */
public abstract class CustomDraw extends Thread {
    SurfaceHolder surfaceHolder;
    int styleType;
    Paint paint;
    public abstract void draw(SurfaceView surfaceView,Shape shape, int styleType);

}

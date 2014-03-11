package com.hhh.pksmart.Util;

import android.graphics.Canvas;
import android.view.SurfaceView;
import com.hhh.pksmart.Interfaces.Shape;
/**
 * Created by kurt on 2/20/14.
 */
public class CustomDrawContext {
    int DRAW_LINE = 1;
    int DRAW_CIRCLE = 2;

    CustomDraw customDraw;
    CustomDrawOnView customDrawOnView;
    public CustomDrawContext(int drawWhat){
        switch (drawWhat){
            case 1:
                customDraw = new DrawLine();
                break;
            case 2:
                customDraw = new DrawCircle();
                break;
            case 3:
                customDrawOnView = new DrawLineOnView();
        }
    }
    public void drawExecute(SurfaceView surfaceView, Shape shape, int styleType){
        customDraw.draw(surfaceView, shape, styleType);
        customDraw.start();
    }
    public void drawOnViewExecute(Canvas canvas, Shape shape, int styleType){
        customDrawOnView.draw(canvas,shape,styleType);
    }
}

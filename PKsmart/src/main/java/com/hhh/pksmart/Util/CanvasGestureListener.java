package com.hhh.pksmart.Util;

import android.graphics.Canvas;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

import com.hhh.pksmart.Interfaces.Element;
import com.hhh.pksmart.Views.CustomViewCurrent;

/**
 * Created by kurt on 2/16/14.
 */
public class CanvasGestureListener extends GestureDetector.SimpleOnGestureListener {

    ViewGroup container;
    //SurfaceView currentView, historyView;
    String elementType;
    Element element;
    Canvas canvas;
    View currentView;

    public CanvasGestureListener(ViewGroup container, String type, View view) {
        this.container = container;
//        this.currentView = currentView;
//        this.historyView = historyView;
        this.elementType = type;
        this.currentView = view;

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.d("gesturelistener","onSingleTapUp");
        return super.onSingleTapUp(e);
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d("gesturelistener","onLongPress");
        super.onLongPress(e);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d("gesturelistener","Scroll"+e1.getX()+":"+e2.getX());
        element.setMotionXY(e1.getX(),e1.getY(),e2.getX(),e2.getY());
        currentView.invalidate();

       // element.drawElement(e1,e2,Storage.CURRENT_SURFACE,1);
        //save the drawing element
        Storage.TEMP_ELEMENT = element;
        return true;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d("gesturelistener","onFling");
        return super.onFling(e1, e2, velocityX, velocityY);
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.d("gesturelistener","onShowPress");
        super.onShowPress(e);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        ElementFactory elementFactory = new ElementFactory();
        element = elementFactory.createElement(elementType);
        ((CustomViewCurrent)currentView).setElement(element);
        Log.d("gesturelistener","onDown");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.d("gesturelistener","onDoubleTap");
        return super.onDoubleTap(e);
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.d("gesturelistener","onDoubleTapEvent");
        return super.onDoubleTapEvent(e);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d("gesturelistener","onSingleTapConfirmed");
        ActionBacrAction actionBacrAction = new ActionBacrAction(container);
        actionBacrAction.changeActioinBarStatus();
        return true;
    }
}

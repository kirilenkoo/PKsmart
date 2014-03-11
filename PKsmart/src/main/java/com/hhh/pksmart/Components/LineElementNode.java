package com.hhh.pksmart.Components;

import android.view.MotionEvent;

import com.hhh.pksmart.Interfaces.Node;

/**
 * Created by kurt on 2/19/14.
 */
public class LineElementNode implements Node {
    float x;
    float y;
    public LineElementNode(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void draw() {

    }
}

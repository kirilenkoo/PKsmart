package com.hhh.pksmart.Util;

import android.graphics.Canvas;

import com.hhh.pksmart.Interfaces.Shape;

/**
 * Created by kurt on 2/21/14.
 */
abstract class CustomDrawOnView {

   abstract void draw(Canvas canvas, Shape shape, int styleType);
}

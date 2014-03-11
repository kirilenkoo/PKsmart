package com.hhh.pksmart.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hhh.pksmart.Interfaces.Element;

/**
 * Created by kurt on 2/21/14.
 */
public class CustomViewCurrent extends View {
    Element element;
    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public CustomViewCurrent(Context context) {
        super(context);
    }

    public CustomViewCurrent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewCurrent(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("ondraw","currentondraw"+canvas.toString());
        if(element!=null){
            element.drawElementOnView(canvas, 3);
        }
        super.onDraw(canvas);
    }
}

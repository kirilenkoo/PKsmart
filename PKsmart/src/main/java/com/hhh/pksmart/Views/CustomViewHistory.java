package com.hhh.pksmart.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hhh.pksmart.Interfaces.Element;
import com.hhh.pksmart.Util.Storage;

/**
 * Created by kurt on 2/21/14.
 */
public class CustomViewHistory extends View {

    public CustomViewHistory(Context context) {
        super(context);
    }

    public CustomViewHistory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewHistory(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("ondraw","historyondraw"+canvas.toString());
        for (Element e: Storage.ELEMENTS){

            e.drawElementOnView(canvas,3);
        }


        super.onDraw(canvas);
    }
}

package com.hhh.pksmart.Fragments;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

import com.hhh.pksmart.Interfaces.Element;
import com.hhh.pksmart.Util.ActionBacrAction;
import com.hhh.pksmart.Util.CanvasGestureListener;
import com.hhh.pksmart.Util.Storage;
import com.hhh.pksmart.Views.CustomViewCurrent;
import com.hhh.pksmart.Views.CustomViewHistory;
import com.hhh.pksmart.Views.HistoryView;
import com.hhh.pksmart.R;
import com.hhh.pksmart.Views.CurrentView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kurt on 2/16/14.
 */
public class CanvasFragment extends Fragment implements View.OnTouchListener{
    GestureDetector gestureDetector;
    String elementTypeName = "line_element";
    CustomViewHistory customViewHistory;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        rootView = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_canvas,null);
//        HistoryView historyView = (HistoryView) rootView.findViewById(R.id.history_view);
//        CurrentView currentView = (CurrentView) rootView.findViewById(R.id.current_view);
//
//        Storage.CURRENT_SURFACE = currentView;
//        Storage.HISTORY_SURFACE = historyView;
        CustomViewCurrent customViewCurrent = (CustomViewCurrent) rootView.findViewById(R.id.current_view);
        customViewHistory = (CustomViewHistory) rootView.findViewById(R.id.history_view);
        //反射 element类型
        List<String> elementNames = Arrays.asList(getResources().getStringArray(R.array.element_name));
        String[] elementClsses = getResources().getStringArray(R.array.elements_classes);
        int elementNameIndex = elementNames.indexOf(elementTypeName);
        Log.d("index",elementNameIndex+"");
        String elementTypeClass = elementClsses[elementNameIndex];

        gestureDetector = new GestureDetector(getActivity(), new CanvasGestureListener((ViewGroup)getActivity().findViewById(R.id.container),elementTypeClass,customViewCurrent));
        rootView.setOnTouchListener(this);
        return rootView;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("gesturelistener","motion"+motionEvent.getAction());

        //判断画完element抬起手指的瞬间
        if(motionEvent.getAction()==1&&Storage.TEMP_ELEMENT!=null) {
            Storage.ELEMENTS.add(Storage.TEMP_ELEMENT);
            ActionBacrAction actionBarAction = new ActionBacrAction((ViewGroup)getActivity().findViewById(R.id.container));
            actionBarAction.addSelectButton();
            Log.d("storage",Storage.ELEMENTS.size()+"");
            //release the temp element
            Storage.TEMP_ELEMENT = null;
            drawHistory();
        }

        return gestureDetector.onTouchEvent(motionEvent);
    }

    private void drawHistory() {
        customViewHistory.invalidate();
       // for (Element e: Storage.ELEMENTS ){
            //e.autodrawElement(Storage.HISTORY_SURFACE, 2);
       // }
    }


}

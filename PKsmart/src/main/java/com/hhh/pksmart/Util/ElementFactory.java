package com.hhh.pksmart.Util;

import android.util.Log;

import com.hhh.pksmart.Interfaces.Element;

/**
 * Created by kurt on 2/19/14.
 */
public class ElementFactory {
   String elementType = "Components.LineElement";


    public Element createElement(String type){
        this.elementType = type;
        try {
            Class elementClass = Class.forName(elementType);
            try {
                Element element = (Element) elementClass.newInstance();
                return  element;
            } catch (InstantiationException e) {
                Log.d("exception",e.toString());
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                Log.d("exception",e.toString());
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            Log.d("exception",e.toString());
            e.printStackTrace();
        }
        return  null;
    }
}

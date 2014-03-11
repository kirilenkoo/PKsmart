package com.hhh.pksmart.Activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.SurfaceView;
import android.view.Window;

import com.hhh.pksmart.Fragments.CanvasFragment;
import com.hhh.pksmart.R;
import com.hhh.pksmart.Util.Storage;

public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CanvasFragment canvasFragment = new CanvasFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.canvas_fl,canvasFragment).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}

package com.hhh.pksmart.Util;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

import com.hhh.pksmart.R;

/**
 * Created by kurt on 2/17/14.
 */
public class ActionBacrAction {
    ViewGroup actionBarContainer;
    LinearLayout topBar, botBar, rightBar, leftBar;
    public ActionBacrAction(ViewGroup viewGroup){
        this.actionBarContainer = viewGroup;
        topBar = (LinearLayout) viewGroup.findViewById(R.id.actionbar_top);
        botBar = (LinearLayout) viewGroup.findViewById(R.id.actionbar_bottom);
        leftBar = (LinearLayout) viewGroup.findViewById(R.id.actionbar_left);
        rightBar = (LinearLayout) viewGroup.findViewById(R.id.actionbar_right);

    }
    public void showActioinBar(){
       View view = actionBarContainer.findViewById(R.id.actionbar_right);
       view.setVisibility(0);
    }

    public void changeActioinBarStatus() {


        switch (botBar.getVisibility()){
            case 0:
                botBar.setVisibility(8);
                rightBar.setVisibility(8);
                leftBar.setVisibility(8);
                topBar.setVisibility(8);
                break;
            case 8:
                botBar.setVisibility(0);

                break;

        }

    }
    public void addSelectButton(){
        LinearLayout botBar = (LinearLayout)actionBarContainer.findViewById(R.id.actionbar_bottom);
        Button selectButton = new Button(actionBarContainer.getContext());
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightBar.setVisibility(0);
                leftBar.setVisibility(0);
                topBar.setVisibility(0);
            }
        });
        selectButton.setText("杆件"+Storage.ELEMENTS.size());
        botBar.addView(selectButton);

    }
}

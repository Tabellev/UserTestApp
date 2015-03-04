package com.example.isabel.usertestapp;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MultipleChoiceFragment extends android.support.v4.app.Fragment {
    private Boolean option1isClicked = false;
    private Boolean option2isClicked = false;
    private Boolean option3isClicked = false;
    private Boolean option4isClicked = false;
    private Boolean dontKnowIsClicked = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_multiple_choice, container, false);
        final Button btnOption1 = (Button)view.findViewById(R.id.btnMulAnsOne);
        final Button btnOption2 = (Button) view.findViewById(R.id.btnMulAnsTwo);
        final Button btnOption3 = (Button) view.findViewById(R.id.btnMulAnsThree);
        final Button btnOption4 = (Button) view.findViewById(R.id.btnMulAnsFour);
        final Button dontKnow = (Button) view.findViewById(R.id.multipleDontKnow);
        final TextView swipe = (TextView) view.findViewById(R.id.multipleChoiceContinue);

        btnOption1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option1isClicked){
                    btnOption1.setBackgroundColor(Color.argb(255, 255, 52, 189));
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option1isClicked = true;
                }else{
                    btnOption1.setBackgroundColor(getResources().getColor(R.color.button_material_light));
                    option1isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                    }
                }

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option2isClicked){
                    btnOption2.setBackgroundColor(Color.argb(255, 255, 52, 189));
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option2isClicked = true;
                }else{
                    btnOption2.setBackgroundColor(getResources().getColor(R.color.button_material_light));
                    option2isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                    }
                }

            }
        });

        btnOption3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option3isClicked){
                    btnOption3.setBackgroundColor(Color.argb(255, 255, 52, 189));
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option3isClicked = true;
                }else{
                    btnOption3.setBackgroundColor(getResources().getColor(R.color.button_material_light));
                    option3isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                    }
                }

            }
        });

        btnOption4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option4isClicked){
                    btnOption4.setBackgroundColor(Color.argb(255, 255, 52, 189));
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option4isClicked = true;
                }else{
                    btnOption4.setBackgroundColor(getResources().getColor(R.color.button_material_light));
                    option4isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                    }
                }

            }
        });

        dontKnow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.argb(255, 255, 52, 189));
                    swipe.setVisibility(View.VISIBLE);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(getResources().getColor(R.color.button_material_light));
                    btnOption1.setEnabled(true);
                    btnOption2.setEnabled(true);
                    btnOption3.setEnabled(true);
                    btnOption4.setEnabled(true);
                    dontKnowIsClicked = false;
                }

            }
        });



        return view;
    }

    public MultipleChoiceFragment(){}

    public static MultipleChoiceFragment newInstance(int index) {
        MultipleChoiceFragment f = new MultipleChoiceFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }
}
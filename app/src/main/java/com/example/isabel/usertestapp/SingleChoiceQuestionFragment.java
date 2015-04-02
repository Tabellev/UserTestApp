package com.example.isabel.usertestapp;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SingleChoiceQuestionFragment extends android.support.v4.app.Fragment {

    /*private Boolean option1isClicked = false;
    private Boolean option2isClicked = false;
    private Boolean dontKnowIsClicked = false;*/
    private Button btnOption1;
    private Button btnOption2;
    private Button dontKnow;
    private TextView swipe;
    private TextView question;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_single_choice_question, container, false);
        btnOption1 = (Button)view.findViewById(R.id.btnAnswerOption1);
        btnOption2 = (Button) view.findViewById(R.id.btnAnswerOption2);
        dontKnow = (Button) view.findViewById(R.id.singleDontKnow);
        swipe = (TextView) view.findViewById(R.id.singleChoiceContinue);
        question = (TextView) view.findViewById(R.id.singleAnswerQuestion);

        btnOption1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnOption1.setBackgroundColor(Color.rgb(7, 147, 194));
                btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                swipe.setVisibility(View.VISIBLE);
                /*if(!option1isClicked){
                    btnOption1.setBackgroundColor(Color.rgb(7, 147, 194));
                    //btnOption2.setEnabled(false);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    //dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option1isClicked = true;
                }else{
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                   //btnOption2.setEnabled(true);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    //dontKnow.setEnabled(true);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    option1isClicked = false;
                }*/

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnOption2.setBackgroundColor(Color.rgb(7, 147, 194));
                btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                swipe.setVisibility(View.VISIBLE);
                /*if(!option2isClicked){
                    btnOption2.setBackgroundColor(Color.rgb(7, 147, 194));
                    //btnOption1.setEnabled(false);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    //dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option2isClicked = true;
                }else{
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    //btnOption1.setEnabled(true);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    //dontKnow.setEnabled(true);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    option2isClicked = false;
                }*/

            }
        });

        dontKnow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                swipe.setVisibility(View.VISIBLE);
                /*if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    //btnOption1.setEnabled(false);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    //btnOption2.setEnabled(false);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    //btnOption1.setEnabled(true);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    //btnOption2.setEnabled(true);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    dontKnowIsClicked = false;
                }*/
            }
        });

        return  view;
    }

    public void setUnclickable(){
        dontKnow.setBackgroundColor(Color.argb(20, 160, 200, 220));
        dontKnow.setTextColor(Color.argb(20, 255, 255, 255));
        dontKnow.setEnabled(false);
        btnOption1.setEnabled(false);
        btnOption1.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btnOption1.setTextColor(Color.argb(20, 255, 255, 255));
        btnOption2.setEnabled(false);
        btnOption2.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btnOption2.setTextColor(Color.argb(20, 255, 255, 255));
        question.setTextColor(Color.argb(20,0,0,0));

        swipe.setText("<<<Time is up! You must swipe to next question!<<<");
        swipe.setTextColor(Color.RED);
        swipe.setVisibility(View.VISIBLE);
    }

    public SingleChoiceQuestionFragment(){}

    public static SingleChoiceQuestionFragment newInstance(int index) {
        SingleChoiceQuestionFragment f = new SingleChoiceQuestionFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }




}

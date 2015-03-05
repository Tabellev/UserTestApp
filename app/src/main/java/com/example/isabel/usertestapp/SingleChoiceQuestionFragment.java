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

    private Boolean option1isClicked = false;
    private Boolean option2isClicked = false;
    private Boolean dontKnowIsClicked = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
         View view = (RelativeLayout)inflater.inflate(R.layout.fragment_single_choice_question, container, false);
        final Button btnOption1 = (Button)view.findViewById(R.id.btnAnswerOption1);
        final Button btnOption2 = (Button) view.findViewById(R.id.btnAnswerOption2);
        final Button dontKnow = (Button) view.findViewById(R.id.singleDontKnow);
        final TextView swipe = (TextView) view.findViewById(R.id.singleChoiceContinue);
        btnOption1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option1isClicked){
                    btnOption1.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption2.setEnabled(false);
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option1isClicked = true;
                }else{
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption2.setEnabled(true);
                    dontKnow.setEnabled(true);
                    option1isClicked = false;
                }

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option2isClicked){
                    btnOption2.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption1.setEnabled(false);
                    dontKnow.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    option2isClicked = true;
                }else{
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption1.setEnabled(true);
                    dontKnow.setEnabled(true);
                    option2isClicked = false;
                }

            }
        });

        dontKnow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    swipe.setVisibility(View.VISIBLE);
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption1.setEnabled(true);
                    btnOption2.setEnabled(true);
                    dontKnowIsClicked = false;
                }
            }
        });

        return  view;
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

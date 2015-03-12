package com.example.isabel.usertestapp;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SingleQuestion6Fragment extends android.support.v4.app.Fragment {

    private Boolean option1isClicked = false;
    private Boolean option2isClicked = false;
    private Boolean dontKnowIsClicked = false;
    private ProgressBar mProgressBar;
    private Button btnOption1;
    private Button btnOption2;
    private Button dontKnow;
    private TextView swipe;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_single_question6, container, false);
        btnOption1 = (Button)view.findViewById(R.id.btnAnswer1SingleQuestion6);
        btnOption2 = (Button) view.findViewById(R.id.btnAnswer2SingleQuestion6);
        dontKnow = (Button) view.findViewById(R.id.DontKnowSingle6);
        swipe = (TextView) view.findViewById(R.id.singleQuestion6Continue);
        mProgressBar=(ProgressBar)view.findViewById(R.id.progressbar3);

        startCountdownTimer();

        btnOption1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option1isClicked){
                    btnOption1.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption2.setEnabled(false);
                    btnOption2.setBackgroundColor(Color.argb(50,160,200,220));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option1isClicked = true;
                }else{
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption2.setEnabled(true);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    dontKnow.setEnabled(true);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    option1isClicked = false;
                }

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option2isClicked){
                    btnOption2.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption1.setEnabled(false);
                    btnOption1.setBackgroundColor(Color.argb(50,160,200,220));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option2isClicked = true;
                }else{
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption1.setEnabled(true);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    dontKnow.setEnabled(true);
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    option2isClicked = false;
                }

            }
        });

        dontKnow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    btnOption1.setEnabled(false);
                    btnOption1.setBackgroundColor(Color.argb(50,160,200,220));
                    btnOption2.setEnabled(false);
                    btnOption2.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption1.setEnabled(true);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption2.setEnabled(true);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    dontKnowIsClicked = false;
                }
            }
        });

        return  view;
    }

    public SingleQuestion6Fragment(){}

    public static SingleQuestion6Fragment newInstance(int index) {
        SingleQuestion6Fragment f = new SingleQuestion6Fragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    private void startCountdownTimer() {

        final int totalMsecs = 10 * 1000;
        mProgressBar.setProgress(totalMsecs);


        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {

                int secondsRemaining = (int) millisUntilFinished / 1000;
                mProgressBar.setProgress(secondsRemaining);
            }

            public void onFinish() {
                mProgressBar.setProgress(0);
                btnOption1.setEnabled(false);
                btnOption1.setBackgroundColor(Color.argb(50,160,200,220));
                btnOption2.setEnabled(false);
                btnOption2.setBackgroundColor(Color.argb(50,160,200,220));
                dontKnow.setEnabled(false);
                dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                swipe.setVisibility(View.VISIBLE);
            }
        }.start();

    }




}

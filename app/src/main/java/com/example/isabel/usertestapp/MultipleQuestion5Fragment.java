package com.example.isabel.usertestapp;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MultipleQuestion5Fragment extends android.support.v4.app.Fragment {
    private Boolean option1isClicked = false;
    private Boolean option2isClicked = false;
    private Boolean option3isClicked = false;
    private Boolean option4isClicked = false;
    private Boolean dontKnowIsClicked = false;
    private Button btnOption1;
    private Button btnOption2;
    private Button btnOption3;
    private Button btnOption4;
    private Button dontKnow;
    private TextView swipe;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_multiple_question5, container, false);
        btnOption1 = (Button)view.findViewById(R.id.btnMultiple5AnsOne);
        btnOption2 = (Button) view.findViewById(R.id.btnMultiple5AnsTwo);
        btnOption3 = (Button) view.findViewById(R.id.btnMultiple5AnsThree);
        btnOption4 = (Button) view.findViewById(R.id.btnMultiple5AnsFour);
        dontKnow = (Button) view.findViewById(R.id.multiple5DontKnow);
        swipe = (TextView) view.findViewById(R.id.multipleChoice5Continue);



        btnOption1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option1isClicked){
                    btnOption1.setBackgroundColor(Color.rgb(7, 147, 194));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option1isClicked = true;
                }else{
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    option1isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                        dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    }
                }

            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option2isClicked){
                    btnOption2.setBackgroundColor(Color.rgb(7, 147, 194));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option2isClicked = true;
                }else{
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    option2isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                        dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    }
                }

            }
        });

        btnOption3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option3isClicked){
                    btnOption3.setBackgroundColor(Color.rgb(7, 147, 194));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option3isClicked = true;
                }else{
                    btnOption3.setBackgroundColor(Color.rgb(160,200,220));
                    option3isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                        dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    }
                }

            }
        });

        btnOption4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!option4isClicked){
                    btnOption4.setBackgroundColor(Color.rgb(7, 147, 194));
                    dontKnow.setEnabled(false);
                    dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                    swipe.setVisibility(View.VISIBLE);
                    option4isClicked = true;
                }else{
                    btnOption4.setBackgroundColor(Color.rgb(160,200,220));
                    option4isClicked = false;
                    if(!option1isClicked && !option2isClicked && !option3isClicked && !option4isClicked){
                        dontKnow.setEnabled(true);
                        dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    }
                }

            }
        });

        dontKnow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    swipe.setVisibility(View.VISIBLE);
                    btnOption1.setEnabled(false);
                    btnOption1.setBackgroundColor(Color.argb(50,160,200,220));
                    btnOption2.setEnabled(false);
                    btnOption2.setBackgroundColor(Color.argb(50,160,200,220));
                    btnOption3.setEnabled(false);
                    btnOption3.setBackgroundColor(Color.argb(50,160,200,220));
                    btnOption4.setEnabled(false);
                    btnOption4.setBackgroundColor(Color.argb(50,160,200,220));
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption1.setEnabled(true);
                    btnOption1.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption2.setEnabled(true);
                    btnOption2.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption3.setEnabled(true);
                    btnOption3.setBackgroundColor(Color.rgb(160,200,220));
                    btnOption4.setEnabled(true);
                    btnOption4.setBackgroundColor(Color.rgb(160,200,220));
                    dontKnowIsClicked = false;
                }

            }
        });



        return view;
    }

    public MultipleQuestion5Fragment(){}

    public static MultipleQuestion5Fragment newInstance(int index) {
        MultipleQuestion5Fragment f = new MultipleQuestion5Fragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

   /* private void startCountdownTimer() {

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
                btnOption3.setEnabled(false);
                btnOption3.setBackgroundColor(Color.argb(50,160,200,220));
                btnOption4.setEnabled(false);
                btnOption4.setBackgroundColor(Color.argb(50,160,200,220));
                dontKnow.setEnabled(false);
                dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                swipe.setVisibility(View.VISIBLE);
            }
        }.start();

    }*/
}

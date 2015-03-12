package com.example.isabel.usertestapp;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.CountDownTimer;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NumericalQuestion5Fragment extends android.support.v4.app.Fragment {

    private Boolean dontKnowIsClicked = false;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPoint;
    private ImageButton btnBackspace;
    private ImageButton btnReset;
    private Button dontKnow;
    private EditText input;
    private TextView swipe;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_numerical_question5, container, false);
        btn0 = (Button)view.findViewById(R.id.btnZeroNumerical5);
        btn1 = (Button) view.findViewById(R.id.btnOneNumerical5);
        btn2 = (Button) view.findViewById(R.id.btnTwoNumerical5);
        btn3 = (Button) view.findViewById(R.id.btnThreeNumerical5);
        btn4 = (Button) view.findViewById(R.id.btnFourNumerical5);
        btn5 = (Button) view.findViewById(R.id.btnFiveNumerical5);
        btn6 = (Button) view.findViewById(R.id.btnSixNumerical5);
        btn7 = (Button) view.findViewById(R.id.btnSevenNumerical5);
        btn8 = (Button) view.findViewById(R.id.btnEightNumerical5);
        btn9 = (Button) view.findViewById(R.id.btnNineNumerical5);
        btnPoint = (Button) view.findViewById(R.id.btnPointNumerical5);
        btnBackspace = (ImageButton) view.findViewById(R.id.backspaceNumerical5);
        btnReset = (ImageButton) view.findViewById(R.id.btnReset5);
        dontKnow = (Button) view.findViewById(R.id.btnNumerical5DontKnow);
        input = (EditText) view.findViewById(R.id.inputNumerical5);
        swipe = (TextView) view.findViewById(R.id.numerical5Continue);

        input.setInputType(InputType.TYPE_NULL);

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "0");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "1");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "2");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "3");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "4");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "5");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "6");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "7");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "8");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(input.getText() + "9");
                swipe.setVisibility(View.VISIBLE);
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(!isPoint(input.getText().toString())){
                    input.setText(input.getText() + ".");
                    swipe.setVisibility(View.VISIBLE);
                }else{
                    return;
                }


            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(method(input.getText().toString()));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText("");

            }
        });


        dontKnow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(!dontKnowIsClicked){
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    btn0.setEnabled(false);
                    btn0.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn1.setEnabled(false);
                    btn1.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn2.setEnabled(false);
                    btn2.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn3.setEnabled(false);
                    btn3.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn4.setEnabled(false);
                    btn4.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn5.setEnabled(false);
                    btn5.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn6.setEnabled(false);
                    btn6.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn7.setEnabled(false);
                    btn7.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn8.setEnabled(false);
                    btn8.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btn9.setEnabled(false);
                    btn9.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btnPoint.setEnabled(false);
                    btnPoint.setBackgroundColor(Color.argb(50,160, 200, 220));
                    btnBackspace.setEnabled(false);
                    btnBackspace.setBackgroundColor(Color.argb(50,160, 200, 220));
                    input.setText("");
                    swipe.setVisibility(View.VISIBLE);
                    dontKnowIsClicked = true;
                }else{
                    dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn0.setEnabled(true);
                    btn0.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn1.setEnabled(true);
                    btn1.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn2.setEnabled(true);
                    btn2.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn3.setEnabled(true);
                    btn3.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn4.setEnabled(true);
                    btn4.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn5.setEnabled(true);
                    btn5.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn6.setEnabled(true);
                    btn6.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn7.setEnabled(true);
                    btn7.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn8.setEnabled(true);
                    btn8.setBackgroundColor(Color.rgb(160, 200, 220));
                    btn9.setEnabled(true);
                    btn9.setBackgroundColor(Color.rgb(160, 200, 220));
                    btnPoint.setEnabled(true);
                    btnPoint.setBackgroundColor(Color.rgb(160, 200, 220));
                    btnBackspace.setEnabled(true);
                    btnBackspace.setBackgroundColor(Color.rgb(160, 200, 220));
                    dontKnowIsClicked = false;
                }

            }
        });

        return view;
    }

    public NumericalQuestion5Fragment(){}

    public static NumericalQuestion5Fragment newInstance(int index) {
        NumericalQuestion5Fragment f = new NumericalQuestion5Fragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    public String method(String str) {
        if (str.length() > 0) {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public boolean isPoint(String str){

        if(str.contains(".")){
            return true;
        }else{
            return false;
        }
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
                btn0.setEnabled(false);
                btn0.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn1.setEnabled(false);
                btn1.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn2.setEnabled(false);
                btn2.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn3.setEnabled(false);
                btn3.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn4.setEnabled(false);
                btn4.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn5.setEnabled(false);
                btn5.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn6.setEnabled(false);
                btn6.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn7.setEnabled(false);
                btn7.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn8.setEnabled(false);
                btn8.setBackgroundColor(Color.argb(50,160, 200, 220));
                btn9.setEnabled(false);
                btn9.setBackgroundColor(Color.argb(50,160, 200, 220));
                btnPoint.setEnabled(false);
                btnPoint.setBackgroundColor(Color.argb(50,160, 200, 220));
                btnBackspace.setEnabled(false);
                btnBackspace.setBackgroundColor(Color.argb(50,160, 200, 220));
                input.setText("");
                swipe.setVisibility(View.VISIBLE);
                dontKnow.setEnabled(false);
                dontKnow.setBackgroundColor(Color.argb(50,160,200,220));
                swipe.setVisibility(View.VISIBLE);
            }
        }.start();

    }*/
}

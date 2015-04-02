package com.example.isabel.usertestapp;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NumericalQuestion1Fragment extends android.support.v4.app.Fragment {

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
    private Button dontKnow;
    private EditText input;
    private TextView swipe;
    private TextView question;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_numerical_question1, container, false);
        btn0 = (Button)view.findViewById(R.id.btnZeroNumerical1);
        btn1 = (Button) view.findViewById(R.id.btnOneNumerical1);
        btn2 = (Button) view.findViewById(R.id.btnTwoNumerical1);
        btn3 = (Button) view.findViewById(R.id.btnThreeNumerical1);
        btn4 = (Button) view.findViewById(R.id.btnFourNumerical1);
        btn5 = (Button) view.findViewById(R.id.btnFiveNumerical1);
        btn6 = (Button) view.findViewById(R.id.btnSixNumerical1);
        btn7 = (Button) view.findViewById(R.id.btnSevenNumerical1);
        btn8 = (Button) view.findViewById(R.id.btnEightNumerical1);
        btn9 = (Button) view.findViewById(R.id.btnNineNumerical1);
        btnPoint = (Button) view.findViewById(R.id.btnPointNumerical1);
        btnBackspace = (ImageButton) view.findViewById(R.id.backspaceNumerical1);
        //final ImageButton btnReset = (ImageButton) view.findViewById(R.id.btnReset1);
        dontKnow = (Button) view.findViewById(R.id.btnNumerical1DontKnow);
        input = (EditText) view.findViewById(R.id.inputNumerical1);
        swipe = (TextView) view.findViewById(R.id.numerical1Continue);
        question = (TextView) view.findViewById(R.id.numericalQuestion1);

        input.setInputType(InputType.TYPE_NULL);

        btn0.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
            dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

            if(event.getAction() == MotionEvent.ACTION_DOWN){
                btn0.setBackgroundColor(Color.rgb(7, 147, 194));
                return true;
            }

            if (event.getAction() == MotionEvent.ACTION_UP) {
                btn0.setBackgroundColor(Color.rgb(160, 200, 220));
                input.setText(input.getText() + "0");
                swipe.setVisibility(View.VISIBLE);
                return true;
            }
            return true;
            }
            });


        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn1.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn1.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "1");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn2.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn2.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "2");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn3.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn3.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "3");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn4.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn4.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "4");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn5.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn5.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "5");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn6.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn6.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "6");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn7.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn7.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "7");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn8.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn8.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "8");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn9.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn9.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(input.getText() + "9");
                    swipe.setVisibility(View.VISIBLE);
                    return true;
                }
                return true;
            }
        });

        btnPoint.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btnPoint.setBackgroundColor(Color.rgb(7, 147, 194));
                    return true;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnPoint.setBackgroundColor(Color.rgb(160, 200, 220));
                    if(!isPoint(input.getText().toString())){
                        input.setText(input.getText() + ".");
                        swipe.setVisibility(View.VISIBLE);
                    }else{
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });

        /*
        btnPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(!isPoint(input.getText().toString())){
                    input.setText(input.getText() + ".");
                    swipe.setVisibility(View.VISIBLE);
                }else{
                    return;
                }


            }
        });*/

        btnBackspace.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dontKnow.setBackgroundColor(Color.rgb(160, 200, 220));

                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btnBackspace.setBackgroundColor(Color.rgb(7, 147, 194));
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnBackspace.setBackgroundColor(Color.rgb(160, 200, 220));
                    input.setText(method(input.getText().toString()));
                }
                return false;
            }
        });

        btnBackspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                input.setText("");
                return true;
            }

        });

        /*
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText(method(input.getText().toString()));

            }
        });*/

        /*btnReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                input.setText("");

            }
        });*/


        dontKnow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    dontKnow.setBackgroundColor(Color.rgb(7, 147, 194));
                    input.setText("");
                    swipe.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }

    public void setUnclickable(){
        dontKnow.setBackgroundColor(Color.argb(20, 160, 200, 220));
        dontKnow.setTextColor(Color.argb(20, 255, 255, 255));
        dontKnow.setEnabled(false);
        btn0.setEnabled(false);
        btn0.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn0.setTextColor(Color.argb(20, 255, 255, 255));
        btn1.setEnabled(false);
        btn1.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn1.setTextColor(Color.argb(20, 255, 255, 255));
        btn2.setEnabled(false);
        btn2.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn2.setTextColor(Color.argb(20, 255, 255, 255));
        btn3.setEnabled(false);
        btn3.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn3.setTextColor(Color.argb(20, 255, 255, 255));
        btn4.setEnabled(false);
        btn4.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn4.setTextColor(Color.argb(20, 255, 255, 255));
        btn5.setEnabled(false);
        btn5.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn5.setTextColor(Color.argb(20, 255, 255, 255));
        btn6.setEnabled(false);
        btn6.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn6.setTextColor(Color.argb(20, 255, 255, 255));
        btn7.setEnabled(false);
        btn7.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn7.setTextColor(Color.argb(20, 255, 255, 255));
        btn8.setEnabled(false);
        btn8.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn8.setTextColor(Color.argb(20, 255, 255, 255));
        btn9.setEnabled(false);
        btn9.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btn9.setTextColor(Color.argb(20, 255, 255, 255));
        btnPoint.setEnabled(false);
        btnPoint.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btnPoint.setTextColor(Color.argb(20, 255, 255, 255));
        btnBackspace.setEnabled(false);
        btnBackspace.setBackgroundColor(Color.argb(20, 160, 200, 220));
        btnBackspace.setImageAlpha(20);
        question.setTextColor(Color.argb(20,0,0,0));
        input.setVisibility(View.GONE);

        swipe.setText("<<<Time is up! You must swipe to next question!<<<");
        swipe.setTextColor(Color.RED);
        swipe.setVisibility(View.VISIBLE);
    }

    public NumericalQuestion1Fragment(){}

    public static NumericalQuestion1Fragment newInstance(int index) {
        NumericalQuestion1Fragment f = new NumericalQuestion1Fragment();
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
}

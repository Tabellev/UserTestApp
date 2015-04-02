package com.example.isabel.usertestapp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.app.Fragment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.animation.AnimationUtils.loadAnimation;

public class StartScreenFragment extends android.support.v4.app.Fragment {

    private TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_start_screen, container, false);
        textView = (TextView) view.findViewById(R.id.tvSwipeToStart);

        String text = textView.getText().toString();
        SpannableString spannableString = new SpannableString(text);
        int start = 0;
        int end = start + text.length();
        spannableString.setSpan(new RainbowSpan(container.getContext()), start, end, 0);


        /*Animation hyperspaceJump = loadAnimation(view.getContext(), R.anim.animation);
        hyperspaceJump.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(hyperspaceJump);*/


        /*final ObjectAnimator animator = ObjectAnimator.ofFloat(textView, "scaleY", 0f, 100f);
        //ObjectAnimator.ofFloat(myView, "rotation", 0f, 360f);
        animator.setDuration(3000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.setInterpolator(new LinearInterpolator());
        animator.start();*/

        return view;
    }

    public StartScreenFragment(){}

    public static StartScreenFragment newInstance(int index) {
        StartScreenFragment f = new StartScreenFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    private static class RainbowSpan extends CharacterStyle implements UpdateAppearance {
        private final int[] colors = new int[]{-16777216, -12303292, -7829368, -1};
        public RainbowSpan(Context context) {
            /*colors = context.getResources().getIntArray(
                    R.array.rainbow);*/
        }

        public void updateDrawState(TextPaint paint) {
            paint.setStyle(Paint.Style.FILL);
            Shader shader = new LinearGradient(0, 0, 0,
                    paint.getTextSize() * colors.length, colors,
                    null, Shader.TileMode.MIRROR);
            Matrix matrix = new Matrix();
            matrix.setRotate(90);
            shader.setLocalMatrix(matrix);
            paint.setShader(shader);
        }
    }
}


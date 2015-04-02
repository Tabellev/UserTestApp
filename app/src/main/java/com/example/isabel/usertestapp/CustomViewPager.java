package com.example.isabel.usertestapp;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Isabel on 26.03.2015.
 */
public class CustomViewPager extends ViewPager {

    float mStartDragX;
    boolean canceledGesture;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                if (mStartDragX < x) {
                    event.setAction(MotionEvent.ACTION_CANCEL);
                } else if (mStartDragX > x) {
                    // TODO: ALT 2015.03.25 - Ugly hack
                    try {
                        return super.onTouchEvent(event);
                    } catch ( Exception e)
                    {
                        return true;
                    }
                }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if ( event.getAction() == MotionEvent.ACTION_CANCEL )
        {
            return false;
        }

        float x = x = event.getX();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mStartDragX = x;
                break;
            case MotionEvent.ACTION_MOVE:
                if (mStartDragX < x) {
                    event.setAction(MotionEvent.ACTION_CANCEL);
                    canceledGesture = true;
                } else if (mStartDragX > x) {
                    super.onInterceptTouchEvent(event);
                }
        }
        return super.onInterceptTouchEvent(event);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewPager(Context context) {
        super(context);
    }
}

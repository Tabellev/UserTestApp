package com.example.isabel.usertestapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;

import java.util.List;
import java.util.Vector;

public class MainActivity extends android.support.v4.app.FragmentActivity {

    private PagerAdapter mPagerAdapter;
    private int oldX;
    private int deltaX = 0;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        this.initialisePaging();
    }

    private void initialisePaging() {

        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, StartScreenFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleChoiceQuestionFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleChoiceFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalInputFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalResetFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, RunFinishedFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SwipeToStartNewRunFragment.class.getName()));
        this.mPagerAdapter  = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
        pager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_MOVE || event.getAction() == MotionEvent.ACTION_DOWN) {
                    int newX = (int) event.getX();
                    deltaX = oldX - newX;
                    oldX = newX;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    oldX = 0;
                }
                return deltaX < 0;
            }
            });
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        private List<Fragment> fragments;

        public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }

    }

    public boolean detectSwipeToRight(MotionEvent event){

        int initialXValue = 0; // as we have to detect swipe to right
        final int SWIPE_THRESHOLD = 100; // detect swipe
        boolean result = false;

        try {
            float diffX = event.getX() - initialXValue;

            if (Math.abs(diffX) > SWIPE_THRESHOLD ) {
                if (diffX > 0) {
                    // swipe from left to right detected ie.SwipeRight
                    result = false;
                } else {
                    // swipe from right to left detected ie.SwipeLeft
                    result = true;
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    @Override
    public void onBackPressed(){}
}

package com.example.isabel.usertestapp;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainActivity extends android.support.v4.app.FragmentActivity {

    private PagerAdapter mPagerAdapter;
    private CustomViewPager pager;
    Fragment f;
    private int oldX;
    private int deltaX = 0;
    ProgressBar mProgressBar;
    private long startTime;
    private long stopTime;
    private long totalTime;
    public TextView time;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        this.initialisePaging();
    }

    private void initialisePaging() {

        final List<Fragment> fragments = new ArrayList<>();
        fragments.add(Fragment.instantiate(this, StartScreenFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleChoiceQuestionFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion1Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleChoiceFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleQuestion2Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion2Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion2Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleQuestion3Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion3Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion4Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion3Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, RunFinishedFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SwipeToStartNewRunFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion4Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleQuestion4Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleQuestion5Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion5Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion5Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion6Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SingleQuestion6Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion6Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, NumericalQuestion7Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MultipleQuestion7Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, SessionFinishedFragment.class.getName()));

        mProgressBar = (ProgressBar)findViewById(R.id.progress);
        this.mPagerAdapter  = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        pager = (CustomViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);

        pager.setOnPageChangeListener(new  ViewPager.OnPageChangeListener() {


            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                    if(position == 11 || position == 12 || position == 23){
                        mProgressBar.setVisibility(View.GONE);
                    } else{
                        mProgressBar.setVisibility(View.VISIBLE);
                        startCountdownTimer();
                    }

                /*if(position > 22){
                    mProgressBar.setVisibility(View.GONE);
                }*/

            }

            @Override
            public void onPageScrollStateChanged(int state) {

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
          /* startTime = System.currentTimeMillis();


            if(position == getCount()){
                Log.e("NOte: ",getUsedTime(startTime,stopTime));
                time.setText(getUsedTime(startTime,stopTime));



            }*/
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {

            return this.fragments.size();
        }

    }

    @Override
    public void onBackPressed(){}

    public void startCountdownTimer() {

        final int totalMsecs = 10 * 1000;
        mProgressBar.setProgress(totalMsecs);
        c.start();
    }

    CountDownTimer c = new CountDownTimer(11000, 1000) {

        public void onTick(long millisUntilFinished) {

            int secondsRemaining = (int) millisUntilFinished / 1000;
            mProgressBar.setProgress(secondsRemaining);
        }

        public void onFinish() {

           mProgressBar.setProgress(0);

            if(mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleChoiceFragment){
                ((MultipleChoiceFragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion2Fragment){
                ((MultipleQuestion2Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion3Fragment){
                ((MultipleQuestion3Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion4Fragment){
                ((MultipleQuestion4Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion5Fragment){
                ((MultipleQuestion5Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion6Fragment){
                ((MultipleQuestion6Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof MultipleQuestion7Fragment){
                ((MultipleQuestion7Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleChoiceQuestionFragment){
                ((SingleChoiceQuestionFragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleQuestion2Fragment){
                ((SingleQuestion2Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleQuestion3Fragment){
                ((SingleQuestion3Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleQuestion4Fragment){
                ((SingleQuestion4Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleQuestion5Fragment){
                ((SingleQuestion5Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof SingleQuestion6Fragment){
                ((SingleQuestion6Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion1Fragment){
                ((NumericalQuestion1Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion2Fragment){
                ((NumericalQuestion2Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion3Fragment){
                ((NumericalQuestion3Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion4Fragment){
                ((NumericalQuestion4Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion5Fragment){
                ((NumericalQuestion5Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion6Fragment){
                ((NumericalQuestion6Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            } else if( mPagerAdapter.fragments.get(pager.getCurrentItem()) instanceof NumericalQuestion7Fragment){
                ((NumericalQuestion7Fragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
            }

            /*String f =  mPagerAdapter.fragments.get(pager.getCurrentItem()).getClass().toString();
            switch(f){
            case "class com.example.isabel.usertestapp.MultipleChoiceFragment":
                ((MultipleChoiceFragment) mPagerAdapter.fragments.get(pager.getCurrentItem())).setUnclickable();
                break;
             }*/
        }




    };

}

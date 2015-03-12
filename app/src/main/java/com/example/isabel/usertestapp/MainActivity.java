package com.example.isabel.usertestapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainActivity extends android.support.v4.app.FragmentActivity {

    private PagerAdapter mPagerAdapter;
    private int oldX;
    private int deltaX = 0;
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

        List<Fragment> fragments = new ArrayList<>();
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
        //fragments.add(Fragment.instantiate(this, NumericalInputFragment.class.getName()));
        //fragments.add(Fragment.instantiate(this, NumericalResetFragment.class.getName()));
       /* time = (TextView)findViewById(R.id.time);
        Log.e("NOte: ","MainActivity");*/

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

                stopTime = System.currentTimeMillis();
                return deltaX < 0;
            }
            });

        pager.setOnPageChangeListener(new  ViewPager.OnPageChangeListener() {


            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

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

    public String getUsedTime(long startTime, long stopTime){

        return String.valueOf((stopTime-startTime));
    }

}

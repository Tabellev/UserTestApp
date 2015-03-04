package com.example.isabel.usertestapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class MainActivity extends android.support.v4.app.FragmentActivity {

    private PagerAdapter mPagerAdapter;

    /* (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
     */
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

    @Override
    public void onBackPressed(){}
}

package com.example.isabel.usertestapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import java.util.Vector;


public class MainActivity extends android.support.v4.app.FragmentActivity {

    private PagerAdapter mPagerAdapter;

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

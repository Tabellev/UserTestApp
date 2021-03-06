package com.example.isabel.usertestapp;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SessionFinishedFragment extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        return (RelativeLayout)inflater.inflate(R.layout.fragment_session_finished, container, false);

    }

    public SessionFinishedFragment(){}

    public static SessionFinishedFragment newInstance(int index) {
        SessionFinishedFragment f = new SessionFinishedFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }
}

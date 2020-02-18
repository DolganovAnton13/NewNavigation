package com.example.newnavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.swipebackfragment.SwipeBackFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccrualsFragment extends SwipeBackFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_accruals, container, false);
        return attachToSwipeBack(view);
    }

}

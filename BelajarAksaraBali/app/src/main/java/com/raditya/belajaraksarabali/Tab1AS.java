package com.raditya.belajaraksarabali;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Raditya on 03/02/2018.
 */

public class Tab1AS extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.tab1_as, container, false);
        return myview;
    }
}
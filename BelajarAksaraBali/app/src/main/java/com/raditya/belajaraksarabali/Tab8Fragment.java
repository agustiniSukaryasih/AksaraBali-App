package com.raditya.belajaraksarabali;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Raditya on 30/01/2018.
 */

public class Tab8Fragment extends Fragment {
    private static final String TAG = "Tab7Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab8_fragment,container,false);

        return view;
    }
}

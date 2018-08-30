package com.itsteps.altair.bindingfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {


    View rootview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){


        rootview=inflater.inflate(R.layout.fragment1, container, false);

        return rootview;
    }
}

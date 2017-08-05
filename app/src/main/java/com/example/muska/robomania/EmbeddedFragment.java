package com.example.muska.robomania;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class EmbeddedFragment extends Fragment {

    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_embedded, container,false);
        imageView = (ImageView) v.findViewById(R.id.imageembedd);
        return v;
    }

}
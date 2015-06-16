package com.example.anton.assignment_2;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Start extends Fragment implements View.OnClickListener{

     ImageButton sokButton;

    public Start() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //blåser upp fragment_start i hela rutan
        View v = inflater.inflate(R.layout.fragment_start, container, false);

        sokButton = (ImageButton)v.findViewById(R.id.img_sok);
        sokButton.setOnClickListener(this);

        return v;

    }


    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Planner planner = new Planner();
        ft.replace(R.id.main,planner);
        ft.addToBackStack(null)
                .commit();
    }
}

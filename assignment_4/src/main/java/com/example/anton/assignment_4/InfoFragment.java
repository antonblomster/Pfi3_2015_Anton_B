package com.example.anton.assignment_4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_info, container, false);
        PlanetObject planet = (PlanetObject) getArguments().getSerializable("planet");

        TextView planetName = (TextView) v.findViewById(R.id.planetName);
        TextView infoRadius = (TextView) v.findViewById(R.id.infoRadius);
        TextView infoTemp = (TextView) v.findViewById(R.id.infoTemp);
        ImageView infoImage = (ImageView) v.findViewById(R.id.infoImage);
        TextView infoText = (TextView) v.findViewById(R.id.infoText);


        planetName.setText(planet.getName());
        infoRadius.setText(planet.getRadius());
        infoTemp.setText(planet.getAvragetemp());
        infoImage.setImageResource(planet.getImage());
        infoText.setText(planet.getDescription());

        return v;
    }


}

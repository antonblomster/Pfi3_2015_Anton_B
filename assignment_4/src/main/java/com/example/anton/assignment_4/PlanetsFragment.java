package com.example.anton.assignment_4;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetsFragment extends Fragment implements AdapterView.OnItemClickListener {

    public ArrayList<PlanetObject> planets = new ArrayList<PlanetObject>();

    GridView planetGrid;
    PlanetAdapter planetAdapter;

//lista med planeter - arraylist som håller objekt av typen planetObject
    //skapa planeterna och stoppa in i ArrayListan
    //hämta stringarray, getresources getstringarray

    public PlanetsFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_planets, container, false);

        int [] planetImages = {
                R.drawable.mercury,
                R.drawable.venus,
                R.drawable.earth,
                R.drawable.mars,
                R.drawable.jupiter,
                R.drawable.saturn,
                R.drawable.uranus,
                R.drawable.neptune};

        String[] planetNames = getResources().getStringArray(R.array.planet_names);
        String[] planetDescription = getResources().getStringArray(R.array.planet_description);
        String[] planetRadius = getResources().getStringArray(R.array.planet_radius);
        String[] planetAvragetemp = getResources().getStringArray(R.array.planet_avragetemp);

        for (int i = 0; i<planetNames.length; i++){
            PlanetObject planet = new PlanetObject(planetNames[i], planetImages[i], planetDescription[i], planetRadius[i], planetAvragetemp[i]);
            planets.add(planet);
        }

        PlanetAdapter pa = new PlanetAdapter(getActivity(),planets);
        GridView gv = (GridView) v.findViewById(R.id.gridView);
        gv.setAdapter(pa);

        gv.setOnItemClickListener(this);

        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        InfoFragment infoFragment = new InfoFragment();
        Bundle b = new Bundle();
        b.putSerializable("planet", planets.get(i));

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        infoFragment.setArguments(b);
        ft.replace(R.id.main, infoFragment).addToBackStack(null).commit();



    }
}

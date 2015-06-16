package com.example.anton.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 15-04-23.
 */
public class PlanetAdapter extends ArrayAdapter<PlanetObject> {

    //Planetlistan får vi från objects
    ArrayList<PlanetObject> planetList;
    Context c; //Var i flödet är vi, får från mainactivity. hämtas alltid från en aktivitet.


    public PlanetAdapter(Context context, ArrayList<PlanetObject> objects) {
        super(context, 0, objects);

        planetList = objects;
        c=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){ //sätter varje sak på rätt plats i gridviewn
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item,null); //list_item är en mall för dina objekt. null = ingen parent

        PlanetObject planet = planetList.get(position); //skapar en ny planet på positionen vi är på nu

        TextView tv = (TextView) convertView.findViewById(R.id.planetText);
        tv.setText(planet.getName());

        ImageView iv = (ImageView) convertView.findViewById(R.id.planetImage);
        iv.setImageResource(planet.getImage());


        return convertView; //convertview är vyn för ett item till skillnad från parent som är hela griden(skärmen)
    }
}

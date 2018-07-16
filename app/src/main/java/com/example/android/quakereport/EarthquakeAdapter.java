package com.example.android.quakereport;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.quake_report, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magTextView = listItemView.findViewById(R.id.earthquake_magnitude);
        String magnitude = Double.toString(currentEarthquake.getMagnitude());
        magTextView.setText(magnitude);

        TextView cityTextView = listItemView.findViewById(R.id.earthquake_city);
        cityTextView.setText(currentEarthquake.getCity());

        TextView dateTextView = listItemView.findViewById(R.id.earthquake_time);
        String time = Long.toString(currentEarthquake.getTime());
        dateTextView.setText(time);


        return listItemView;
    }

}

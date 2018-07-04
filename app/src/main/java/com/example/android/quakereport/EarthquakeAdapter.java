package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by himanshuyadav on 03/07/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquakejava> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquakejava> earthquakes) {
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }



        Earthquakejava currentEarthquake = getItem(position);

        TextView mTextViewmag = (TextView) listItemView.findViewById(R.id.magnitude);
        mTextViewmag.setText(currentEarthquake.getmag());

        TextView mTextViewplace = (TextView) listItemView.findViewById(R.id.location);
        mTextViewplace.setText(currentEarthquake.getplace());

        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());


        TextView mTextViewdate = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        // Return the list item view that is now showing the appropriate data


        return listItemView;

    }
}

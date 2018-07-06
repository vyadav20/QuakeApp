package com.example.android.quakereport;

import android.widget.ArrayAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.android.quakereport.R.id.date;

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
        mTextViewmag.setText(currentEarthquake.getMag());

        TextView mTextViewplace = (TextView) listItemView.findViewById(R.id.location);
        mTextViewplace.setText(currentEarthquake.getPlace());

        /*TextView mTextViewdate = (TextView) listItemView.findViewById(R.id.date);
        mTextViewdate.setText(currentEarthquake.getdate());

        TextView mTextViewtime=(TextView) listItemView.findViewById(R.id.time);
        mTextViewtime.setText(currentEarthquake.gettimeInMilliseconds());



        return listItemView;*/



       /* Earthquakejav currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView mTextViewmag = (TextView) listItemView.findViewById(R.id.magnitude);8

        // Display the magnitude of the current earthquake in that TextView
        mTextViewmag.setText(currentEarthquake.getmag());

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLocation());*/



        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());
        SimpleDateFormat sdf= new SimpleDateFormat("MMMMM,dd,yyyy");
        String dateString= sdf.format(dateObject);

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(date);
        // Format the date string (i.e. "Mar 3, 1984")
        //String formattedDate = dateString(dateObject);
        // Display the date of the current earthquake in that TextView
        //dateView.setText(formattedDate);
        dateView.setText(dateString);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
        String timeFormatted=formatter.format(dateObject.getTime());
        //String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
       // timeView.setText(formattedTime);

        // Return the list item view that is now showing the appropriate data
        return listItemView;


}
}

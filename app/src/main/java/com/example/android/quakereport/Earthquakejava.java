package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by himanshuyadav on 03/07/18.
 */

public class Earthquakejava {

    private String mmag;
    private String mplace;
    private String mdate;
    private long mTimeInMilliseconds;

    public Earthquakejava(String Mag, String Place, String Date, long TimeInMilliseconds) {
        mmag = Mag;
        mplace = Place;
        mdate=Date;
        mTimeInMilliseconds = TimeInMilliseconds;
    }

    public String getMag() {
        return mmag;
    }

    public String getPlace() {
        return mplace;
    }

    public String getdate(){return mdate;}

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}

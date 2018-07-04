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

    public Earthquakejava(String mag, String place, String date, long timeInMilliseconds) {
        mmag = mag;
        mplace = place;
        mdate=date;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getmag() {
        return mmag;
    }

    public String getplace() {
        return mplace;
    }

    public String getdate(){return mdate;}

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}

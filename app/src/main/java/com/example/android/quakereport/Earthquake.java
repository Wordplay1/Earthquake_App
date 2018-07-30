package com.example.android.quakereport;

public class Earthquake {


    private double mMagnitude;

    private String mCity;

    private long mTime;

    public String getmUrl() {
        return mUrl;
    }

    private String mUrl;

    public Earthquake(double magnitude, String city, long time, String url){
        mMagnitude = magnitude;
        mCity = city;
        mTime = time;
        mUrl = url;
    }
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public long getTime() {
        return mTime;
    }
    public String toString(){
        String str = "";
        str += ""+mMagnitude;
        str += ""+mCity;
        str += ""+mTime;

        return str;

    }
    public String getUrl() {
        return mUrl;
    }
}

package com.example.knightshade.myapplication;

/**
 * Created by knightshade on 11/3/17.
 */

public class Location {
    private double mCurrentLongitude;
    private double mCurrentLatitude;

    public Location(){

    }

    public Location(double currentLatitude, double currentLongitude){
        mCurrentLatitude = currentLatitude;
        mCurrentLongitude = currentLongitude;
    }

    public double getmCurrentLongitude(){
        return mCurrentLongitude;
    }

    public double getmCurrentLatitude(){
        return mCurrentLatitude;
    }
}

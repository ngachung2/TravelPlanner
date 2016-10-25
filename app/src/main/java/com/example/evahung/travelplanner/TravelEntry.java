package com.example.evahung.travelplanner;

import android.provider.BaseColumns;

/**
 * Created by Eva Hung on 26/10/2016.
 */
public class TravelEntry implements BaseColumns {
    public static final String TBL_NAME = "travel";
    public static final String COL_NAME_TRAVEL_NAME = "travel_name";
    public static final String COL_NAME_TRAVEL_SDATE = "travel_start";
    public static final String COL_NAME_TRAVEL_EDATE = "travel_end";
    public static final String COL_NAME_TRAVEL_BUDGET = "budget";
}

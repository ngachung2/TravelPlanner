package com.example.evahung.travelplanner;

import android.provider.BaseColumns;

/**
 * Created by Eva Hung on 26/10/2016.
 */
public class ActivityEntry implements BaseColumns {
    public static final String TBL_NAME = "activity";
    public static final String COL_NAME_ACTIVITY_LOCATION_NAME = "location_name";
    public static final String COL_NAME_ACTIVITY_SDATE = "startDate";
    public static final String COL_NAME_ACTIVITY_EDATE = "endDate";
    public static final String COL_NAME_ACTIVITY_EXPENSE = "expense";
    public static final String COL_NAME_ACTIVITY_ADDRESS = "address";
    public static final String COL_NAME_ACTIVITY_IMAGE_PATH = "image_path";
    public static final String COL_NAME_ACTIVITY_ACTIVITY_TYPE = "activity_type";
}

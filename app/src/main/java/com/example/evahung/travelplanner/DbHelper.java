package com.example.evahung.travelplanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Eva Hung on 26/10/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "travelData.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    private static final String ACTIVITY_SQL_CREATE_ENTRIES = "CREATE TABLE "
            + ActivityEntry.TBL_NAME + "("+ ActivityEntry._ID + " INTEGER PRIMARY KEY,"
            + ActivityEntry.COL_NAME_ACTIVITY_LOCATION_NAME + TEXT_TYPE + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_SDATE + TEXT_TYPE + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_EDATE + TEXT_TYPE + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_EXPENSE + " FLOAT" + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_ADDRESS + TEXT_TYPE + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_IMAGE_PATH + TEXT_TYPE + COMMA_SEP
            + ActivityEntry.COL_NAME_ACTIVITY_ACTIVITY_TYPE + TEXT_TYPE + ");";

    private static final String TRAVEL_SQL_CREATE_ENTRIES = "CREATE TABLE "
            + TravelEntry.TBL_NAME + "(" + TravelEntry._ID + " INTEGER PRIMARY KEY,"
            + TravelEntry.COL_NAME_TRAVEL_NAME + TEXT_TYPE + COMMA_SEP
            + TravelEntry.COL_NAME_TRAVEL_SDATE + TEXT_TYPE + COMMA_SEP
            + TravelEntry.COL_NAME_TRAVEL_EDATE + TEXT_TYPE + COMMA_SEP
            + TravelEntry.COL_NAME_TRAVEL_BUDGET + " FLOAT);";

    private static final String TRAVEL_ACTIVITY_SQL_CREATE_ENTRIES = "CREATE TABLE "
            + TravelActivityEntry.TBL_NAME + "(" + TravelActivityEntry._ID + " INTEGER PRIMARY KEY,"
            + TravelActivityEntry.COL_NAME_ACTIVITY_ID + " INTEGER" + COMMA_SEP
            + TravelActivityEntry.COL_NAME_TRAVEL_ID + " INTEGER);";

    public DbHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL(ACTIVITY_SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(TRAVEL_SQL_CREATE_ENTRIES);
        sqLiteDatabase.execSQL(TRAVEL_ACTIVITY_SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ActivityEntry.TBL_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TravelEntry.TBL_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TravelActivityEntry.TBL_NAME);

        onCreate(sqLiteDatabase);
    }
}

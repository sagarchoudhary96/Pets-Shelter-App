package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by admin on 25-11-2016.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    //LOG TAG
    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    //If we change Database Schema we need to change the Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //SQL query to create table
        final String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + " ("
                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + PetEntry.COLUMN_PET_BREED + " TEXT, "
                + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0"
                +");";

        // Execute CREATE_PETS_TABLE Query
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

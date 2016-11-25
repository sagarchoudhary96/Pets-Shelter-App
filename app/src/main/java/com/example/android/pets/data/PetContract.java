package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by admin on 25-11-2016.
 */

public final class PetContract {

    // To prevent From someone instantiating the contract class,
    // decalered constructor private
    private PetContract(){}


    /**
    * Inner class to define table contents
    */
    public static final class PetEntry implements BaseColumns {

        // Table Name
        public static final String TABLE_NAME = "pets";

        //base column for database to uniquely identify pets
        public static final String _ID = BaseColumns._ID;

        //Column names
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        // possible values for gender of the pets
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}

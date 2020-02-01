package org.atctech.al_quranbangla.DB;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseHelper extends SQLiteAssetHelper {


    public static final String DATABASE_NAME = "quran.db";
    public static final int DATABASE_VERSION = 14;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.setForcedUpgrade();
    }
}

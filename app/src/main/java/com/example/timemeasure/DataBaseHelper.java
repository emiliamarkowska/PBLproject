package com.example.timemeasure;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String databaseName = "dataBaseTimeMeasure";
    public static final int version = 1;

    // NAMES OF TABLE AND COLUMNS OF USERS AND INFORMATION ABOUT THEM
    public static final String tableUsersName = "usersTable";
    public static final String userID = "userID";
    public static final String userAge = "userAge";
    public static final String userStudentOrWorker = "StudentOrWorker";
    public static final String userTimeOfUsing = "TimeOfUsing";


    public DataBaseHelper(Context context) {
        super(context, databaseName, null, version);
        SQLiteDatabase database = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREATE USERS TABLE
        final String createUsersTable = "CREATE TABLE " +
                tableUsersName + "( " +
                userID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                userAge + " INTEGER NOT NULL, " +
                userStudentOrWorker + " TEXT NOT NULL, " +
                userTimeOfUsing + " TIME NOT NULL" +
                        ");";

        db.execSQL(createUsersTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

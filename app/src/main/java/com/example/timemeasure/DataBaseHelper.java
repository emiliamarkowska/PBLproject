package com.example.timemeasure;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    // DATABASE STRINGS
    public static final String databaseName = "dataBaseTimeMeasure";
    public static final int version = 1;

    // NAMES OF TABLE AND COLUMNS OF USERS AND INFORMATION ABOUT THEM
    public static final String tableUsersName = "usersTable";
    public static final String userID = "userID";
    public static final String userAge = "userAge";
    public static final String userStudentOrWorker = "StudentOrWorker";
    public static final String userTimeOfUsing = "TimeOfUsing";
    public static final String userTimeAtSchoolOrWorkPerWeek = "TimeAtSchoolOrWorkPerWeek";
    public static final String userTimeOnHobbyPerWeek = "TimeOnHobbyPerWeek";
    public static final String userTimeOnTravellingPerWeek = "TimeOnTravellingPerWeek";

    // NAMES OF TABLE AND COLUMNS OF USERS AND APPLICATIONS THEY USE
    public static final String tableUsersAndAppsName = "usersAndAppsTable";
    public static final String userAndAppID = "userAndAppID";
    public static final String userID1 = "userID";
    public static final String appName = "appName";
    public static final String timeOfUsing = "timeOfUsing";

    MainActivity activity;


    public DataBaseHelper(Context context, MainActivity activity) {
        super(context, databaseName, null, version);
        SQLiteDatabase database = this.getWritableDatabase();
        this.activity = activity;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREATE USERS TABLE
        final String createUsersTable = "CREATE TABLE " +
                tableUsersName + "( " +
                userID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                userAge + " INTEGER NOT NULL, " +
                userStudentOrWorker + " TEXT NOT NULL, " +
                userTimeOfUsing + " DATE NOT NULL, " +
                userTimeAtSchoolOrWorkPerWeek + " DECIMAL NOT NULL, " +
                userTimeOnHobbyPerWeek + " DECIMAL NOT NULL, " +
                userTimeOnTravellingPerWeek + " DECIMAL NOT NULL" +
                ");";

        db.execSQL(createUsersTable);

        // CREATE USERS AND APPS RELATION TABLE
        final String createUsersAndAppsTable = "CREATE TABLE " +
                tableUsersAndAppsName + "( " +
                userAndAppID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                userID1 + " INTEGER NOT NULL, " +
                appName + " TEXT NOT NULL, " +
                timeOfUsing + " TIME NOT NULL " +
                ");";

        db.execSQL(createUsersAndAppsTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                db.execSQL("DROP TABLE IF EXISTS " + tableUsersName);
                db.execSQL("DROP TABLE IF EXISTS " + tableUsersAndAppsName);
                onCreate(db);
    }

    public void addInformationAboutUser(User user)
    {
        ContentValues cv = new ContentValues();
        cv.put(userAge, user.getAge());
        cv.put(userStudentOrWorker, user.getStudentOrWorker());
        cv.put(userTimeOfUsing, user.getDate());
        cv.put(userTimeAtSchoolOrWorkPerWeek, user.getTimeAtSchool());
        cv.put(userTimeOnHobbyPerWeek, user.getTimeOnHobby());
        cv.put(userTimeOnTravellingPerWeek, user.getTimeOnTravel());
        SQLiteDatabase db = this.getReadableDatabase();
        db.insert(tableUsersName, null, cv);
    }

    public boolean isEmpty()
    {
        boolean isEmpt = true;
        String selectQuery = "SELECT * FROM " + tableUsersName;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.getCount() > 0) isEmpt = false;
        return isEmpt;
    }
}

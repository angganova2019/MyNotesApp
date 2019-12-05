package com.latihan.mynotesapp.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    static String TABLE_NAME = "note";

    public static final class NoteColumns implements BaseColumns {
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String DATE = "date";


    }
}

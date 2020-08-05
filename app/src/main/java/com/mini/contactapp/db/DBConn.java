package com.mini.contactapp.db;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class DBConn {

    private static ContactAppDatabase contactAppDatabase;

    public static ContactAppDatabase getConnection(Context context) {
        if(contactAppDatabase == null) {
            contactAppDatabase = Room.databaseBuilder(context,ContactAppDatabase.class,"ContactDB")
                    .allowMainThreadQueries()
                    .build();
        }

        return contactAppDatabase;
    }
}

package com.mini.contactapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mini.contactapp.db.model.Contact;
import com.mini.contactapp.repository.ContactRepository;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactAppDatabase extends RoomDatabase {
    public abstract ContactRepository contactRepository();
}

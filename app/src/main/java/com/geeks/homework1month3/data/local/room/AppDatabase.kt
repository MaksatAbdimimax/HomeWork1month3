package com.geeks.homework1month3.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geeks.homework1month3.data.NotesModel


@Database(entities = [NotesModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao(): NoteDao
}
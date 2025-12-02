package com.geeks.homework1month3.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.geeks.homework1month3.data.NotesModel
    @Dao
interface NoteDao {

    @Query("SELECT * FROM notes_list ORDER BY id DESC")
    fun getAllNotes(): List <NotesModel>

    @Insert
    fun insert(notesModel: NotesModel)

    @Update
    fun updateNote (notesModel: NotesModel)
}
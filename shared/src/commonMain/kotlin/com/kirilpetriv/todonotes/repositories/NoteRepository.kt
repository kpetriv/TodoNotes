package com.kirilpetriv.todonotes.repositories

import com.kirilpetriv.todonotes.models.Note

interface NoteRepository {
    fun getAllNotes(): List<Note>
    fun saveNote(note: Note)
    fun deleteNoteById(id: Note.Id)
}
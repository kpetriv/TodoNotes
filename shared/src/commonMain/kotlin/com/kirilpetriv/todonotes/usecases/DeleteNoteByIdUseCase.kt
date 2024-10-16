package com.kirilpetriv.todonotes.usecases

import com.kirilpetriv.todonotes.models.Note

interface DeleteNoteByIdUseCase {
    suspend operator fun invoke(id: Note.Id): List<Note>
}
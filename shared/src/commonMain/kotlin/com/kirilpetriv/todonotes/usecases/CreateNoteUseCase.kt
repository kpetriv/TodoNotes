package com.kirilpetriv.todonotes.usecases

import com.kirilpetriv.todonotes.models.Note

interface CreateNoteUseCase {
    suspend operator fun invoke(note: Note)
}
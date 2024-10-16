package com.kirilpetriv.todonotes.usecases

import com.kirilpetriv.todonotes.models.Note

interface GetAllNotesUseCase {
    suspend operator fun invoke(): List<Note>
}
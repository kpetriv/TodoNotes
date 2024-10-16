package com.kirilpetriv.todonotes.usecases

interface SyncNotesWithGoogleDriveUseCase {
    suspend operator fun invoke()
}
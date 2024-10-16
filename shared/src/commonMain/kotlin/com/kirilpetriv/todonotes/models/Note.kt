package com.kirilpetriv.todonotes.models

import kotlin.jvm.JvmInline

data class Note(
    val id: Id,
    val title: String,
    val content: String,
    val timestamp: Long
) {
    @JvmInline
    value class Id(val value: Long) {
        companion object {
            val Invalid = Id(value = -1)
        }
    }
}
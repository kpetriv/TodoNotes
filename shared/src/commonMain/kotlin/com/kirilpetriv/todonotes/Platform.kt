package com.kirilpetriv.todonotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.example.multi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
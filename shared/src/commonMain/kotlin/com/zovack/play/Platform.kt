package com.zovack.play

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
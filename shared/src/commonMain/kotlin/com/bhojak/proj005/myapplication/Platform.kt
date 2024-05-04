package com.bhojak.proj005.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
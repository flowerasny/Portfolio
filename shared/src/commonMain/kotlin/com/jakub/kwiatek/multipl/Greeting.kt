package com.jakub.kwiatek.multipl

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
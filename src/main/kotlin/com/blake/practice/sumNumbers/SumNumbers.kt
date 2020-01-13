package com.blake.practice.sumNumbers

import java.lang.IllegalStateException

class Calculator {

    private val punchline = "My name is Yoshikage Kira."
    val name = "Oh-ho, so you're approaching me?"

    fun sum(x: Int, y: Int): Int {
        if (x < 0 || y < 0) {
            println("Negative numbers not allowed.")
            throw IllegalStateException("Negative numbers not allowed.")
        }
        return x+y
    }

    fun jotaro(x: Int, y: Int): Int {
        return x-y
    }

    fun kira(x: Int, y: Int): Int {
        return x*y

    }

    fun josuke(x: Int, y: Int) = x/y
}
package com.blake.practice.sumNumbers

import org.junit.jupiter.api.Test

class MoriohChoTest {
    var inputone = "Thundercross Split Attack!"
    var inputtwo = "Smoke"
    var inputthree = "Jotaro"

    val decisiontree = MoriohCho()

    @Test
    fun testdecision() {

        println(decisiontree.decision(inputone))
        println(decisiontree.decision(inputtwo))
        println(decisiontree.decision(inputthree))

    }

    @Test
    fun iteration() {
        decisiontree.cycle("Wha-")
    }
}
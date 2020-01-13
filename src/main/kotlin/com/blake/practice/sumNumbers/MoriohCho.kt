package com.blake.practice.sumNumbers

class MoriohCho {

    fun decision(input: String) =
        when (input) {
            "Thundercross Split Attack!" -> "HINJAKU HINJAKU"
            "Smoke" -> "Fire!"

            else -> "I dont know"

        }

    fun cycle(input: String)  {

        var num = 0

        while (num <= 100) {
            println(input)
            num += 1
        }
    }
    }


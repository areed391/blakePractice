package com.blake.practice.sumNumbers

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class SumNumbersTest {
    private val calculator = SumNumbers()
    private val firstNumber = 6
    private val secondNumber = 6
    private val thirdNumber = 8
    private val fourthNumber = 4

    @Test
    fun testSumNumbers() {
        val sum = calculator.sum(firstNumber, secondNumber)
        assertThat(sum).isEqualTo(12)
        println("Your sum is = $sum")
    }
}
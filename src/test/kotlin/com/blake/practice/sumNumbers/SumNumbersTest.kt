package com.blake.practice.sumNumbers

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class SumNumbersTest {
    private val calculator = Calculator()
    private val firstNumber = 6
    private val secondNumber = 6
    private val thirdNumber = 8
    private val fourthNumber = 4

    var dio = -2
    @Test
    fun testSumNumbers() {
        val sum = calculator.sum(dio, secondNumber)
//        assertThat(sum).isEqualTo(11)
        println("Your sum is = $sum")

    }

    @Test
    fun testMinusNumbers() {
        val dif = calculator.jotaro(thirdNumber, fourthNumber)
        assertThat(dif).isEqualTo(4)
        println("Yare yare daze. It is $dif")
    }

    @Test
    fun testMultiplyNumbers() {
        val product = calculator.kira(3, 5)
//        assertThat(product).isEqualTo(15)
        println("Your answer is $product")
    }
}
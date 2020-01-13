package com.blake.practice.sumNumbers

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import java.lang.IllegalStateException

class SumNumbersTest {
    private val calculator = Calculator()
    private val firstNumber = 6
    private val secondNumber = 6
    private val thirdNumber = 8
    private val fourthNumber = 4

    var dio = -2
    @Test
    fun testSumNumbersWithNegativeValue() {
        //Changing the assertion to expect an exception (since 'Dio' is now a negative number :-)
        assertThatExceptionOfType(IllegalStateException::class.java).isThrownBy { calculator.sum(dio, secondNumber) }
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
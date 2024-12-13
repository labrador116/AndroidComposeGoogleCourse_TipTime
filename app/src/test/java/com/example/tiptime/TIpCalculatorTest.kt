package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TIpCalculatorTest {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(10.00, 20.00, false)
        assertEquals(expectedTip, actualTip)
    }
}
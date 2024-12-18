package com.example.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val testRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        testRule.setContent {
            TipTimeTheme {
                TipTimeLayout()
            }
        }
        testRule.onNodeWithText("Bill Amount")
            .performTextInput("10")
        testRule.onNodeWithText("Tip Percentage")
            .performTextInput("20")

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        testRule.onNodeWithText("Tip Amount: $expectedTip").assertExists("No node with this text was found.")
    }
}
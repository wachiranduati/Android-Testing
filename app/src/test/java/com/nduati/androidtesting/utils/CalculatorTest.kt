package com.nduati.androidtesting.utils

import junit.framework.TestCase
import org.junit.Before

class CalculatorTest : TestCase() {

    val calc = Calculator()

    fun testAddItems() {
        assertEquals(4, calc.addItems(2,2))
    }
}
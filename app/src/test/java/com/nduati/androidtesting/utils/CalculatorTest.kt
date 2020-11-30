package com.nduati.androidtesting.utils

import junit.framework.TestCase
import org.junit.Before

class CalculatorTest : TestCase() {

    lateinit var calc : Calculator

    override fun setUp() {
        super.setUp()
        calc = Calculator()
    }

    fun testAddItems() {
        assertEquals(4, calc.addItems(2,2))
    }
}
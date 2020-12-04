package com.nduati.androidtesting.utils

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class CalculatorTest : TestCase() {

    lateinit var calc : Calculator

    override fun setUp() {
        super.setUp()
        calc = Calculator()
    }

    @Test
    fun testAddItems() {
        assertEquals("This method is called if the assertion is not true",4, calc.addItems(2,2))
    }

//    @Before
//    covers class methods that are run before the @Test method is run

//    @After
//    This is run after the @Test is run

//    @Ignore
//    This will ignore the @Test
}
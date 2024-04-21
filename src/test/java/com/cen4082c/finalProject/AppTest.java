package com.cen4082c.finalProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the App class.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test the Fibonacci sequence calculation
     */
    public void testCalculateFibonacci() {
        assertEquals(0, App.calculateFibonacci(0));
        assertEquals(1, App.calculateFibonacci(1));
        assertEquals(1, App.calculateFibonacci(2));
        assertEquals(2, App.calculateFibonacci(3));
        assertEquals(3, App.calculateFibonacci(4));
        assertEquals(5, App.calculateFibonacci(5));
        assertEquals(8, App.calculateFibonacci(6));
    }
}

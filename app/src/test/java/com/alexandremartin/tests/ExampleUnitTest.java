package com.alexandremartin.tests;

import android.app.Activity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplyBy_isCorrect() {

        MainActivity main = new MainActivity();
        int result = main.multiplyBy(7);

        assertEquals(46, result);
    }

    @Test
    public void average_isCorrect() {

        MainActivity main = new MainActivity();
        double avg = main.average(3, 5, 4);

        assertEquals(4, avg, 0.001);
    }
}
package com.udacity.gradle.jokes.test;

import com.udacity.gradle.jokes.Joker;

import org.junit.Test;

/**
 * Created by joseluis on 14/11/2017.
 */

public class JokerTest {
    @Test
    public void testGetJoke() {
        Joker joker = new Joker();
        assert joker.getJoke().length() != 0;
    }
}

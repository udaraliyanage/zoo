package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class BirdTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void birdShouldBeAbleToWalk() {
        new Bird().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void birdShouldBeAbleToFly() {
        new Bird().fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Test
    public void birdShouldBeAbleToSing() {
        new Bird().sing();
        assertThat(outContent.toString(), containsString("I am singing"));
    }
}
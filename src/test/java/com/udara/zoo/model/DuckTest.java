package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class DuckTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void duckShouldBeAbleToWalk() {
        new Duck().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void duckShouldBeAbleToFly() {
        new Duck().fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Test
    public void duckShouldSingInADifferentWay() {
        new Duck().sing();
        assertThat(outContent.toString(), containsString("Quack , quack"));
    }

    @Test
    public void duckShouldBeAbleToSwim() {
        new Duck().swim();
        assertThat(outContent.toString(), containsString("Duck Swimming"));
    }

}
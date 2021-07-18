package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class DogTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void dogShouldBeAbleToWalk() {
        new Dog().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void dogShouldBeAbleToShout() {
        new Dog().shout();
        assertThat(outContent.toString(), containsString("Bab Baw"));
    }

    @Test
    public void dogShouldBeAbleToSwim() {
        new Dog().swim();
        assertThat(outContent.toString(), containsString("Swiming keeping head out of water"));
    }
}
package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class FrogTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void frogShouldBeAbleToWalk() {
        new Frog().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void frogShouldBeAbleToShout() {
        new Frog().speak();
        assertThat(outContent.toString(), containsString("Baka Baka"));
    }

    @Test
    public void frogShouldBeAbleToSwim() {
        new Frog().swim();
        assertThat(outContent.toString(), containsString("Swimming on surface of water"));
    }

    @Test
    public void frogShouldBeAbleToJump() {
        new Frog().jump();
        assertThat(outContent.toString(), containsString("I am jumping"));
    }
}
package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class RoosterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void roosterShouldBeAbleToWalk() {
        new Rooster().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void roosterShouldBeAbleTo() {
        new Rooster().shout();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }
}
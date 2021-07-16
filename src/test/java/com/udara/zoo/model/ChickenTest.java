package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ChickenTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void chickenShouldBeAbleToWalk() {
        new Chicken(null).walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void chickenShouldBeAbleToSpeakAsHen() {
        new Chicken(new HenSpeakingBehavior()).shout();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
    }

    @Test
    public void chickenShouldBeAbleToSpeakAsRooster() {
        new Chicken(new RoosterSpeakingBehavior()).shout();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }

}
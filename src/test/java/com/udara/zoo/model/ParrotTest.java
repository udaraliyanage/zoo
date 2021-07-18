package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ParrotTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void parrotShouldBeAbleToWalk() {
        new Parrot(null).walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void parrotShouldBeAbleToFly() {
        new Parrot(null).fly();
        assertThat(outContent.toString(), containsString("I am flying"));
    }

    @Test
    public void parrotLivingWithDogShouldSpeackAsWoofwoof() {
        new Parrot(new ParrotLivingWithDogSpeakingBehavior()).shout();
        assertThat(outContent.toString(), containsString("Woof, woof"));
    }

    @Test
    public void parrotLivingWithCatShouldSpeackAsMeow() {
        new Parrot(new ParrotLivingWithCatSpeakingBehavior()).shout();
        assertThat(outContent.toString(), containsString("Me ow"));
    }

    @Test
    public void parrotLivingWithRoosterShouldSpeackAsCockADoo() {
        new Parrot(new ParrotLivingWithRoosterSpeakingBehavior()).shout();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }
}
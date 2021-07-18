package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class CatTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void catShouldBeAbleToWalk() {
        new Cat().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    public void catShouldBeAbleToShout() {
        new Cat().speak();
        assertThat(outContent.toString(), containsString("Me ow"));
    }

    @Test
    public void catShouldBeAbleToSwim() {
        new Cat().swim();
        assertThat(outContent.toString(), containsString("Swimming quietly keeping head on top"));
    }

}
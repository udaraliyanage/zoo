package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.udara.zoo.model.Colour.GREY;
import static com.udara.zoo.model.Size.LARGE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

public class SharkTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void sharkShouldBeBig() {
        assertEquals(LARGE, new Shark().getSize());
    }

    @Test
    public void sharkShouldBeGrey() {
        assertEquals(GREY, new Shark().getColour());
    }

    @Test
    public void sharkShouldBeAbleToEatFish() {
        new Shark().eat(null);
        assertThat(outContent.toString(), containsString("What a yummy meal"));
    }

    @Test
    public void sharkShouldBeAbleToMakeSwim() {
        new Shark().swim();
        assertThat(outContent.toString(), containsString("default swim method for Fish"));
    }
}
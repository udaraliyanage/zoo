package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.udara.zoo.model.Colour.ORANGE;
import static com.udara.zoo.model.Size.SMALL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

public class ClownFishTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void clownFishShouldBeSmall() {
        assertEquals(SMALL, new ClownFish().getSize());
    }

    @Test
    public void clownFishShouldBeColourFull() {
        assertEquals(ORANGE, new ClownFish().getColour());
    }

    @Test
    public void clownFishShouldBeAbleToMakeJokes() {
        new ClownFish().makeJoke();
        assertThat(outContent.toString(), containsString("Where do fish sleep, on water bed!"));
    }

    @Test
    public void clownFishShouldBeAbleToMakeSwim() {
        new ClownFish().swim();
        assertThat(outContent.toString(), containsString("default swim method for Fish"));
    }
}
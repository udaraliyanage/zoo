package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ButterflyTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void caterpillarShouldWalk() {
        new Butterfly().walk();
        assertThat(outContent.toString(), containsString("Caterpillar crawling"));
    }

    @Test
    public void caterpillarShouldNotFly() {
        Butterfly butterfly = new Butterfly();
        assertFalse(butterfly.canFly());

        butterfly.fly();
        assertThat(outContent.toString(), containsString(""));
    }

    @Test
    public void onceCaterpillarBecomeButteryItCanFly() {
        Butterfly butterfly = new Butterfly();
        butterfly.transform();//become a butterfly

        butterfly.fly();
        assertThat(outContent.toString(), containsString("Buttery flying"));
        assertTrue(butterfly.canFly());

    }
}
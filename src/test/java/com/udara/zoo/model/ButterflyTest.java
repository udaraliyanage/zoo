package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

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
        new Butterfly().fly();
        assertThat(outContent.toString(), containsString(""));
    }

    @Test
    public void onceCaterpillarBecomeButteryItCanFly() {
        Butterfly caterpillar = new Butterfly();
        caterpillar.transform();//become a butterfly

        caterpillar.fly();
        assertThat(outContent.toString(), containsString("Buttery flying"));
    }
}
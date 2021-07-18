package com.udara.zoo.model;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static java.util.Locale.FRENCH;
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
        new Chicken(new HenSpeakingBehavior()).speak();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
    }

    @Test
    public void chickenShouldBeAbleToSpeakAsRooster() {
        new Chicken(new RoosterSpeakingBehavior()).speak();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void frenchRoosterShouldSpeakInFrenchLanguage() {
        new Chicken(new RoosterSpeakingBehavior(), FRENCH).speak();
        assertThat(outContent.toString(), containsString("cocorico"));
    }

    @Test
    public void frenchHenShouldSpeakInFrenchLanguage() {
        new Chicken(new HenSpeakingBehavior(), FRENCH).speak();
        assertThat(outContent.toString(), containsString("cicirico"));
    }

    @Test
    public void sinhaleseRoosterShouldSpeakInSinhalaLanguage() {
        new Chicken(new RoosterSpeakingBehavior(), new Locale("si", "LK")).speak();
        assertThat(outContent.toString(), containsString("kokkukuuu"));
    }

    @Test
    public void ifLocaleIsNotMentionedRoosterShouldSpeckInDefaultWay() {
        new Chicken(new RoosterSpeakingBehavior(), null).speak();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-do"));
    }
}
package com.udara.zoo.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotLivingWithCatSpeakingBehaviorTest {

    @Test
    public void parrotLivingWithCatShouldShoutAsMeow() {
        Assert.assertEquals("Me ow", new ParrotLivingWithCatSpeakingBehavior().getSpeech());
    }
}
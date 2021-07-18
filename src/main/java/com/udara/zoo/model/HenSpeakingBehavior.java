package com.udara.zoo.model;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.*;

public class HenSpeakingBehavior extends ChickenSpeakingBehavior {

    private static Map<Locale, String> languageVoiceMap = Map.of(
            getDefault(), "Cluck, cluck",
            FRENCH, "cicirico"
    );

    public HenSpeakingBehavior() {
        super(languageVoiceMap);
    }
}

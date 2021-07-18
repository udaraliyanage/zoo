package com.udara.zoo.model;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.*;

public class RoosterSpeakingBehavior extends ChickenSpeakingBehavior {

    private static Map<Locale, String> languageVoiceMap = Map.of(
                                                        getDefault(), "Cock-a-doodle-doo",
                                                        FRENCH, "cocorico",
                                                        new Locale("si", "LK"), "kokkukuuu"
                                                    );
    public RoosterSpeakingBehavior() {
        super(languageVoiceMap);
    }

}

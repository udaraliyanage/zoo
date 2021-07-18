package com.udara.zoo.model;

import java.util.Locale;
import java.util.Map;

public  class ChikenSpeakingBehavior {

    private Map<Locale, String> languageVoiceMap;

    ChikenSpeakingBehavior(Map<Locale, String> languageVoiceMap) {
        this.languageVoiceMap = languageVoiceMap;
    }

    public  void speak(){
        speak(Locale.getDefault());
    }

    public  void speak(Locale locale){
        System.out.println(languageVoiceMap.get(locale));
    }
}

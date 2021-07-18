package com.udara.zoo.model;

import java.util.Locale;
import java.util.Map;

public  class ChickenSpeakingBehavior {

    private Map<Locale, String> languageVoiceMap;

    ChickenSpeakingBehavior(Map<Locale, String> languageVoiceMap) {
        this.languageVoiceMap = languageVoiceMap;
    }

    public  void speak(){
        speak(Locale.getDefault());
    }

    public  void speak(Locale locale){
        String speech = locale == null ? languageVoiceMap.get(Locale.getDefault()) : languageVoiceMap.get(locale);
        System.out.println(speech);
    }
}

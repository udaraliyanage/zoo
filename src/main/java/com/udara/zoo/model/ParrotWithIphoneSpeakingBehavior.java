package com.udara.zoo.model;

public class ParrotWithIphoneSpeakingBehavior extends SpeakingBehavior {

    @Override
    public String getSpeech() {
        //this is Iphone ringing sound
        return "Ton kota tan tan ton ton";
    }
}

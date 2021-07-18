package com.udara.zoo.model;


public class Butterfly extends Animal implements Insect {

    private boolean alreadyTransformed = false;
    private Insect metamorphosisStatus;

    public Butterfly() {
        // starting as a Caterpillar
        metamorphosisStatus = new CaterpillarState();
    }

    public Butterfly(String name) {
        super(name);
    }

    @Override
    public void fly() {
         metamorphosisStatus.fly();
    }

    @Override
    public void walk() {
         metamorphosisStatus.walk();
    }

    public void transform(){
        if (alreadyTransformed){
            return;
        }

        System.out.println("I am becoming a beautiful butterfly now");
        this.metamorphosisStatus = new ButterflyState();
        alreadyTransformed = true;
    }
}

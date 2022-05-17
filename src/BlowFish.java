package com.company;

public class BlowFish extends Fish {
    private int diametercruz56329;

    BlowFish(){
        super();
        diametercruz56329=10;
    }

    public BlowFish(String namecruz56329String , int agecruz56329 , int weightcruz56329, String scaleColorcruz56329, int diametercruz56329){
        super(namecruz56329String,agecruz56329,weightcruz56329,scaleColorcruz56329);
        this.diametercruz56329=diametercruz56329;

    }

    public BlowFish(int agecruz56329, String scaleColorcruz56329, int diametercruz56329){
        super(agecruz56329, scaleColorcruz56329);
        this.diametercruz56329=diametercruz56329;
    }

    public void swimcruz56329(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoicecruz56329() {
        System.out.println("The blowfish is howling");
    }

    public int getDiametercruz56329() {
        return diametercruz56329;
    }

    public void setDiametercruz56329(int diametercruz56329) {
        this.diametercruz56329 = diametercruz56329;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diametercruz56329=" + diametercruz56329 +
                '}';
    }
}

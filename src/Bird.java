package com.company;

public class Bird extends Animal{
    private String featherColorcruz56329;



    public Bird(){
        super();
        featherColorcruz56329="NN";

    }

    public Bird (String namecruz56329, int agecruz56329, int weightcruz56329, String featherColorcruz56329){
        super(namecruz56329, agecruz56329, weightcruz56329);
        this.featherColorcruz56329=featherColorcruz563295;
    }

    public Bird(int agecruz56329 , String featherColorcruz56329){
        super(agecruz56329);
        this.featherColorcruz56329=featherColorcruz56329;
    }

    public void takingFlightcruz56329(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicecruz56329() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColorcruz56329() {
        return featherColorcruz56329;
    }

    public void setFeatherColorcruz56329(String featherColorcruz56329) {
        this.featherColorcruz56329 = featherColorcruz56329;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorcruz56329='" + featherColorcruz56329 + '\'' +
                '}';
    }
}
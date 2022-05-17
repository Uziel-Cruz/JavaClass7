package com.company;

public class Fish extends Animal {
    private String scaleColorcruz56329;

    public Fish(){
        super();
        scaleColorcruz56329= "NN";
    }

    public Fish(String namecruz56329, int agecruz56329 , int weightcruz56329, String scaleColorcruz56329){
        super(namecruz56329, agecruz56329, weightcruz56329);
        this.scaleColorcruz56329= scaleColorcruz56329;
    }

    public Fish(int agecruz56329 , String scaleColorcruz56329){
        super(agecruz56329);
        this.scaleColorcruz56329=scaleColorcruz56329;
    }

    public void drinkWatercruz56329(){
        System.out.println("Drink");
    }

    @Override
    public void getVoicecruz56329() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorcruz56329() {
        return scaleColorcruz56329;
    }

    public void setScaleColorcruz56329(String scaleColorcruz56329) {
        this.scaleColorcruz56329 = scaleColorcruz56329;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorcruz56329='" + scaleColorcruz56329 + '\'' +
                '}';
    }
}
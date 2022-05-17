package com.company;

abstract class Animal {
    private String namecruz56329;
    private int agecruz56329;
    private int weightcruz56329;

    public Animal(){
        agecruz56329 = weightcruz56329 = 10;
        namecruz56329 = "NN";
    }

    public Animal(String namecruz56329 ,int agecruz56329 , int weightcruz56329){
        this.namecruz56329 = namecruz56329;
        this.agecruz56329= agecruz56329;
        this.weightcruz56329= weightcruz56329;
    }

    public Animal(int agecruz56329){
        this.agecruz56329=agecruz56329;
    }

    public abstract void eatcruz56329(String FoodName);

    public abstract void getVoicecruz56329();

    public String getNamecruz56329() {
        return namecruz56329;
    }

    public void setNamecruz56329(String namecruz56329) {
        this.namecruz56329 = namecruz56329;
    }

    public int getAgecruz56329() {
        return agecruz56329;
    }

    public void setAgecruz56329(int agecruz56329) {
        this.agecruz56329 = agecruz56329;
    }

    public int getWeightcruz56329() {
        return weightcruz56329;
    }

    public void setWeightcruz56329(int weightcruz56329) {
        this.weightcruz56329 = weightcruz56329;
    }
}
package com.company;

public class Pigeon extends Bird{
    private String speciescruz56329;

    Pigeon(){
        super();
        speciescruz56329="NN";
    }

    public Pigeon(String namecruz56329, int agecruz56329, int weightcruz56329, String featherColorcruz56329, String speciescruz56329){
        super(namecruz56329, agecruz56329, weightcruz56329,featherColorcruz56329);
        this.speciescruz56329= speciescruz56329;
    }

    public Pigeon(int agecruz56329, String featherColorcruz56329, String speciescruz56329){
        super(agecruz56329, featherColorcruz56329);
        this.speciescruz56329=speciescruz56329;
    }

    public void peckingWoodcruz56329(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoicecruz56329() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciescruz56329() {
        return speciesShava56415;
    }

    public void setSpeciescruz56329(String speciescruz56329) {
        this.speciescruz56329 = speciescruz56329;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciescruz56329='" + speciescruz56329 + '\'' +
                '}';
    }
}
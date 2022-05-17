package com.company;

public class Dog extends Mammal{
    private String breedcruz56329;

    Dog(){
        super();
        breedcruz56329= "NN";
    }

    public Dog(String namecruz56329 , int agecruz56329,int weightcruz56329,String rzadcruz56329, String breedcruz56329){
        super(namecruz56329,agecruz56329,weightcruz56329,rzadcruz56329);
        this.breedcruz56329=breedcruz56329;
    }

    public Dog(int agecruz56329, String rzadcruz56329, String breedcruz56329){
        super(agecruz56329,rzadcruz56329);
        this.breedcruz56329=breedcruz56329;
    }

    public void sportcruz56329(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkcruz56329() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicecruz56329() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    public String getBreedcruz56329() {
        return breedcruz56329;
    }

    public void setBreedcruz56329(String breedcruz56329) {
        this.breedcruz56329 = breedcruz56329;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedcruz56329='" + breedcruz56329 + '\'' +
                '}';
    }
}
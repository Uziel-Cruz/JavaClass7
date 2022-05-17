package com.company;

public class Mammal extends Animal {

    private String ordercruz56329;

    public Mammal(){
        super();
        ordercruz56329 = "NN";
    }

    public Mammal(String namecruz56329, int agecruz56329 , int weightcruz56329, String ordercruz56329){
        super(namecruz56329, agecruz56329, weightcruz56329);
        this.ordercruz56329=ordercruz56329;
    }

    public Mammal(int agecruz56329 , String ordercruz56329){
        super(agecruz56329);
        this.ordercruz56329=ordercruz56329;
    }

    public void drinkMilkscruz56329(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicecruz56329() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatcruz56329(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrdercruz56329() {
        return ordercruz56329;
    }

    public void setOrdercruz56329(String ordercruz56329) {
        this.ordercruz56329 = ordercruz56329;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "ordercruz56329='" + ordercruz56329 + '\'' +
                '}';
    }
}
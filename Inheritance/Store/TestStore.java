package com.java.inheritance.Store;

public class TestStore {
    public static void main(String[] args){
        WebStore myFirstStore= new WebStore("Amazon", "10.198.11.200",
                "React");
        System.out.println(myFirstStore);
        Restaurant myRestaurant = new Restaurant("4U",1000, 300000);
        System.out.println(myRestaurant);
        System.out.printf("Tax is :%.0f ",myRestaurant.tax());
    }
}

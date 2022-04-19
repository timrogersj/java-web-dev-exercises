package org.launchcode.java.studios.RestaurantMenu;

public class Main {
    public static void main(String[] args){

        MenuItems item1 = new MenuItems(name: "Chili dogs", price: 4.99, description: "Fully loaded chili dogs", category: "Entree");

        System.out.println(item1.getName());

    }
}

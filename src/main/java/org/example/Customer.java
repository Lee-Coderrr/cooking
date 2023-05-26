package org.example;

public class Customer {

    void order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(menuName);
        Cook cook = cooking.makeCook(menuItem);

    }
}

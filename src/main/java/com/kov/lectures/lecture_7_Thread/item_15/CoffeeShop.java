package com.kov.lectures.lecture_7_Thread.item_15;

public class CoffeeShop {
    public static void main(String[] s) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }

}
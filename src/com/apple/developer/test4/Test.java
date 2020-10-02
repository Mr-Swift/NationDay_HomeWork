package com.apple.developer.test4;

public class Test {
    public static void main(String[] args) throws Exception {
        Drink.getDrink(Drink.getCOFFEE()).taste();
        Drink.getDrink(Drink.getBEER()).taste();
        Drink.getDrink(Drink.getMILK()).taste();
    }
}

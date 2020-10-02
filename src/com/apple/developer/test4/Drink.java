package com.apple.developer.test4;

public abstract class Drink {
    private static int COFFEE = 1;
    private static int BEER = 2;
    private static int MILK = 3;

    public Drink() {
    }

    public static int getCOFFEE() {
        return COFFEE;
    }

    public static int getBEER() {
        return BEER;
    }

    public static int getMILK() {
        return MILK;
    }

    protected abstract void taste();

    protected static Drink getDrink(int drinkType) throws Exception {
        switch (drinkType) {
            case 1:
                return new Coffee();
            case 2:
                return new Beer();
            case 3:
                return new Milk();
            default:
                throw new DrinkNotFoundException();
        }
    }
}

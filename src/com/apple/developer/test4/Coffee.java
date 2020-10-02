package com.apple.developer.test4;

public class Coffee extends Drink {
    public Coffee() {
    }

    @Override
    protected void taste() {
        System.out.println("咖啡味儿");
    }
}

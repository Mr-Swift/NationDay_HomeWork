package com.apple.developer.test4;

public class Beer extends Drink {
    public Beer() {
    }

    @Override
    protected void taste() {
        System.out.println("啤酒味儿");
    }
}

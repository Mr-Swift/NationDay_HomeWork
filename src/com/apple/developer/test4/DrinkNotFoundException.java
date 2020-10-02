package com.apple.developer.test4;

public class DrinkNotFoundException extends Exception {
    public DrinkNotFoundException() {
        super("对不起，没有相对应的饮料！");
    }
}

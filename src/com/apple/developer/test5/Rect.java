package com.apple.developer.test5;

public class Rect {
    protected double width;
    protected double height;

    protected Rect() {
        this.width = 10;
        this.height = 10;
    }

    protected Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected double getArea() {
        return this.width * this.height;
    }

    protected double getPerimeter() {
        return (this.width + this.height) * 2;
    }
}

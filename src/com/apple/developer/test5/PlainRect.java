package com.apple.developer.test5;

public class PlainRect extends Rect{
    private double startX;
    private double startY;

    public PlainRect(double width, double height, double startX, double startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        this.startX = 0;
        this.startY = 0;
        this.width=0;
        this.height=0;
    }

    protected boolean isInside(double x,double y){
        if(x>=startX&&x<=(startX+width)&&y>startY&&y<=(startY+height))
            return true;
        return false;
    }
}

package com.apple.developer.test5;

public class Test {
    public static void main(String[] args) {
        PlainRect r=new PlainRect(20,10,10,10);
        System.out.println("面积："+r.getArea()+"\t周长："+r.getPerimeter());
        if(r.isInside(13,13))
            System.out.println("点（13，13）在矩形内");
        else
            System.out.println("点（13，13）不在矩形内");
    }
}

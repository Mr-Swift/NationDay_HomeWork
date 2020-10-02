package com.apple.developer.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一串大小写混合的字母字符串：");
        String str = input.next();
        Inversion inversion = new Inversion();
        System.out.println("大小写转换并倒序输出的结果为：" + inversion.reverse(str));
    }
}

package com.apple.developer.test3;

public class Test {
    public static void main(String[] args) {
        System.out.print("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                c *= j;
            }
            sum += c;
        }
        System.out.println(sum);
    }
}

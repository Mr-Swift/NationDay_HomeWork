package com.apple.developer.test1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws NoThisSoundException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入一个数：");
            int index = input.nextInt();
            new Player().play(index);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

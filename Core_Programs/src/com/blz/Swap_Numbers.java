package com.blz;

import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number(x):");
        Scanner in1 = new Scanner(System.in);
        int num1 = in1.nextInt();
        System.out.println("Enter the second number(y):");
        Scanner in2 = new Scanner(System.in);
        int num2 = in2.nextInt();
        int x = num1;
        num1 = num2;
        num2 = x;
        System.out.println("x:"+num1);
        System.out.println("y:"+num2);
    }
}
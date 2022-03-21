package com.blz;

import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner in1 = new Scanner(System.in);
        int num1 = in1.nextInt();
        System.out.println("Enter the second number:");
        Scanner in2 = new Scanner(System.in);
        int num2 = in2.nextInt();
        System.out.println("Enter the third number:");
        Scanner in3 = new Scanner(System.in);
        int num3 = in3.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int largest = num3 > temp ? num3 : temp;
        System.out.println("The largest number is:" + largest);
    }
}
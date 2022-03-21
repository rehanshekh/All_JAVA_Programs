package com.blz;

import java.util.Scanner;

public class Harmonic_Number {

    public static void main(String[] args) {
        System.out.println("Enter the nth number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        float x = 0;
        if (a > 0)
            for (float i = 1; i <= a; i++){
                x = (x + (1 / i));
            }
        System.out.println("The Harmonic number is " + x);
    }
}

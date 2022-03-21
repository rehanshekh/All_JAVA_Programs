package com.blz;

import java.util.Scanner;

public class Power_2 {
    public static void main(String[] args) {
        System.out.println("Enter the nth number");
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        if (nth > 0)
        for (int i = 1; i <= nth; i++){
           int a = (2*i);
            System.out.println(a);
        }
else System.out.println("NA");
    }
}
package com.blz;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num==0)
            System.out.println(num+" Is Even");
        else if ((num%2)==0)
        System.out.println(num+" Is Even");
        else System.out.println(num+" Is Odd");
    }
}

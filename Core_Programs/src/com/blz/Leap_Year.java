package com.blz;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int length = String.valueOf(year).length();
        if (length == 4)
        {
            if ((year % 4) == 0)
            System.out.println("OK");
            if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)))
            System.out.println("Yes, its a leap year");
            else
            System.out.println("Not a Leap Year");

        }
    }
}




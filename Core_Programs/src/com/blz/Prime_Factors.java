package com.blz;

import java.util.Scanner;

public class Prime_Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number to find Prime Factors of:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int isprime = 0;
        if (a > 1)
            for (int i = 2; i <= a; i++) {
                int x = (a % i);
                if (x == 0)
                    isprime = 1;
                for (int j = 2; j <= (i / 2); j++) {
                    int y = (i % j);
                    if (y == 0)
                        isprime = 0;
                    break;
                }

                if (isprime == 1)
                    System.out.println(i);
            }



    }
}


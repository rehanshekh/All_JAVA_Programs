package com.blz;

import java.util.Scanner;

public class Flip_Coin {


    public static void main(String[] args) {
        float h = 0;
        float t = 0;
        System.out.println("Enter the number of times the coin to flip:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int x = 1; x <= a; x++) {
            double random = Math.floor(Math.random() * 10) % 2;
            if (random == 1.0)
                h = h + 1;
            else
                t = t + 1;
        }
        float hpercent = ((h / a) * 100);
        float tpercent = ((t / a) * 100);
        System.out.println("Heads(%)=" + h + "(" + hpercent + ")");
        System.out.println("Tails=" + t + "(" + tpercent + ")");

    }
}


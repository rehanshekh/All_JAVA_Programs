package com.blz;

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        System.out.println("Enter the Dividend");
        Scanner in1 = new Scanner(System.in);
        float dividend = in1.nextFloat();
        System.out.println("Enter the Divisor");
        Scanner in2 = new Scanner(System.in);
        float divisor = in2.nextFloat();
        float quotient =((dividend / divisor));
        float remainder =((dividend % divisor));
        System.out.println("The Quotient is:" + quotient);
        System.out.println("The Remainder is:" + remainder);

    }
}

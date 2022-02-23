package com.geometry;

import java.util.Scanner;

public class Geometry_3 {
    public static void main(String[] args) {
        System.out.println("Enter the x1-coordinate of Line A:");
        Scanner Ain1 = new Scanner(System.in);
        float Ax1 = Ain1.nextFloat();
        System.out.println("Enter the y1-coordinate of Line A:");
        Scanner Ain2 = new Scanner(System.in);
        float Ay1 = Ain2.nextFloat();
        System.out.println("Enter the x2-coordinate of Line A:");
        Scanner Ain3 = new Scanner(System.in);
        float Ax2 = Ain3.nextFloat();
        System.out.println("Enter the y2-cooordinate of Line A:");
        Scanner Ain4 = new Scanner(System.in);
        float Ay2 = Ain4.nextFloat();
        System.out.println("Enter the x1-coordinate of Line B:");
        Scanner Bin1 = new Scanner(System.in);
        float Bx1 = Bin1.nextFloat();
        System.out.println("Enter the y1-coordinate of Line B:");
        Scanner Bin2 = new Scanner(System.in);
        float By1 = Bin2.nextFloat();
        System.out.println("Enter the x2-coordinate of Line B:");
        Scanner Bin3 = new Scanner(System.in);
        float Bx2 = Bin3.nextFloat();
        System.out.println("Enter the y2-cooordinate of Line B:");
        Scanner Bin4 = new Scanner(System.in);
        float By2 = Bin4.nextFloat();
        double length1 = Math.sqrt((Ax2 - Ax1) * (Ax2 - Ax1) + (Ay2 - Ay1) * (Ay2 - Ay1));
        double length2 = Math.sqrt((Bx2 - Bx1) * (Bx2 - Bx1) + (By2 - By1) * (By2 - By1));
        String A = Double.toString(length1);
        String B = Double.toString(length2);
        System.out.println(A.compareTo(B));
    }
}

package com.blzoops;

import java.util.Scanner;

public class Geometry {
    private final double xx1;
    private final double yy1;
    private final double xx2;
    private final double yy2;

    public Geometry(double x1, double y1, double x2, double y2) {
        xx1 = x1;
        yy1 = y1;
        xx2 = x2;
        yy2 = y2;
    }

    public double equationAt() {
        double dx = xx2 - xx1;
        double dy = yy2 - yy1;
        double value = Math.sqrt((dx * dx) + (dy * dy));
        return value;
    }

    public static String isequal(double a1, double a2) {
        Double a1obj = a1;
        Double a2obj = a2;
        boolean result = (a1obj.equals(a2obj));
        double answer = a1obj.compareTo(a2obj);
        if (result && answer == 0) {
            System.out.println("Line 1 and Line 2 are Equal");
        } else if (answer < 1) {
            System.out.println("Line 1 and Line 2 Are Unequal, Line 1 is less than Line 2");
        } else System.out.println("Line 1 and Line 2 Are Unequal, Line 1 is greater than line 2");
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value for x1 co-ordinate of Line 1(x1):");
        Scanner in1 = new Scanner(System.in);
        double x1 = in1.nextDouble();
        System.out.println(("Enter the value for y1 co-ordinate of Line 1(y1):"));
        Scanner in2 = new Scanner(System.in);
        double y1 = in2.nextDouble();
        System.out.println("Enter the value for x2 co-ordinate of Line 1(x2):");
        Scanner in3 = new Scanner(System.in);
        double x2 = in3.nextDouble();
        System.out.println("Enter the value for y2 co-ordinate of Line 1(y2):");
        Scanner in4 = new Scanner(System.in);
        double y2 = in4.nextDouble();
        System.out.println("Enter the value for x1 co-ordinate of Line 2(x1):");
        Scanner in5 = new Scanner(System.in);
        double a1 = in1.nextDouble();
        System.out.println(("Enter the value for y1 co-ordinate of Line 2(y1):"));
        Scanner in6 = new Scanner(System.in);
        double b1 = in2.nextDouble();
        System.out.println("Enter the value for x2 co-ordinate of Line 2(x2):");
        Scanner in7 = new Scanner(System.in);
        double a2 = in3.nextDouble();
        System.out.println("Enter the value for y2 co-ordinate of Line 2(y2):");
        Scanner in8 = new Scanner(System.in);
        double b2 = in4.nextDouble();
        Geometry l1 = new Geometry(x1, y1, x2, y2);
        Geometry l2 = new Geometry(a1, b1, a2, b2);
        double v1 = l1.equationAt();
        double v2 = l2.equationAt();
        System.out.println("Length of line 1:" + v1);
        System.out.println("Length of Line 2:" + v2);
        String equalto = isequal(v1, v2);
    }
}

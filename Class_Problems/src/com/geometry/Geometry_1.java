package com.geometry;

public class Geometry_1 {

        public static void main(String[] args) {
            double x1 = ((Math.floor(Math.random() * 10) % 90) + 10);
            int y1 = 20;
            int x2 = 30;
            double y2 = ((Math.floor(Math.random() * 10) % 90) + 10);
            double answer = Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
            System.out.println("The length of line is " +answer);
        }
    }

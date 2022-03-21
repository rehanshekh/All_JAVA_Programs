package com.blz;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows(M):");
        Scanner in1 = new Scanner(System.in);
        int rows = in1.nextInt();
        System.out.println("Enter the number of columns(N):");
        Scanner in2 = new Scanner(System.in);
        int cols = in2.nextInt();
        int[][] twoD_arr = new int[rows][cols];
        Scanner in3 = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the number to be stored in rows(" + i + ")" + " and column(" + j + ")");
                twoD_arr[i][j] = in3.nextInt();
            }
            System.out.println();
        }
                for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(twoD_arr[i][j] + " ");
            }
            System.out.println();
        }
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Above is the Output of the 2D Array");
        writer.flush();
        writer.close();
    }
}

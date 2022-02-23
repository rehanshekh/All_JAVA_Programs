package com.blz;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet:");
        Scanner in = new Scanner(System.in);
        char alphabet = in.next().charAt(0);
        char alphabet1 = Character.toLowerCase(alphabet);
        if (alphabet1 == 'a' || alphabet1 == 'e' || alphabet1 == 'i' || alphabet1 == 'o' || alphabet1 == 'u'){
            System.out.println(alphabet+" is Vowel");
        }else System.out.println(alphabet+ " is Consonant");
    }
}

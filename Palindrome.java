package com.blz.day2problem;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = sc.nextInt();

        int revrsed = 0;
        int Palindrome = number;
        for (; number != 0; number = number / 10) {

            revrsed = revrsed * 10 + number % 10;
        }
        if (Palindrome == revrsed) {
            System.out.println("This number is Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }

}
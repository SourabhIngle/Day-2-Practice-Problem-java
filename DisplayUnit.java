package com.blz.day2problem;

import java.util.Scanner;

public class DisplayUnit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display unit = ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("One = " + number);
        } else if (number == 10) {
            System.out.println("Ten =" + 10);
        } else if (number == 100) {
            System.out.println("Hundred = " + 100);
        } else if (number == 1000) {
            System.out.println("Thousand =" + 1000);
        } else {
            System.out.println("Enter invalid number .");
        }

    }
}

package com.blz.day2problem;

import java.util.Scanner;

public class ReadSingleDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int Digit = sc.nextInt();


        if (Digit == 0) {
            System.out.println("Zero");
        } else if (Digit == 1) {
            System.out.println("One");
        } else if (Digit == 2) {
            System.out.println("Two");
        } else if (Digit == 3) {
            System.out.println("Three");
        } else if (Digit == 4) {
            System.out.println("Fore");
        } else if (Digit == 5) {
            System.out.println("Five");
        } else if (Digit == 6) {
            System.out.println("Six");
        } else if (Digit == 7) {
            System.out.println("Seven");
        } else if (Digit == 8) {
            System.out.println("Eight");
        } else if (Digit == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Invalid Digit");
        }

    }

}

package com.blz.day2problem;

import java.util.Scanner;

public class ReversedNumberFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered number = " + num);
        int reversed = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed number = " + reversed);


    }
}

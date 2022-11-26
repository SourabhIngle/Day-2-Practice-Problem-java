package com.blz.day2problem;

import java.util.Scanner;

public class AddStartToEndWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N = ");
        int N = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= N) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of N numbers = " + sum);

    }
}
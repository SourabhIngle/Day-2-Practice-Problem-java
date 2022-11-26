package com.blz.day2problem;

import java.util.Scanner;

public class MinMax {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value b = ");
        int b = sc.nextInt();
        System.out.print("Enter the value c = ");
        int c = sc.nextInt();

        int A = (a + b * c);
        int B = (c + a / b);
        int C = (a % b + c);
        int D = (a * b + c);


        if ((A > B) && (A > C) && (A > D)) {
            System.out.println("A is Max " + A);
        } else if ((B > A) && (B > C) && (B > D)) {
            System.out.println("B is Max " + B);
        } else if ((C > A) && (C > B) && (C > D)) {
            System.out.println("C is Max " + C);
        } else {
            System.out.println("D is Max " + D);
        }


        if ((A < B) && (A < C) && (A < D)) {
            System.out.println("A is Min " + A);
        } else if ((B < A) && (B < C) && (B < D)) {
            System.out.println("B is Min " + B);
        } else if ((C < A) && (C < B) && (C < D)) {
            System.out.println("C is Min " + C);
        } else {
            System.out.println("D is Min " + D);
        }

    }
}

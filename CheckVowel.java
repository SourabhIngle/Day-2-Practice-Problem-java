package com.blz.day2problem;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {

        System.out.print("Enter Single Letter = ");
        Scanner sc = new Scanner(System.in);

        char letter = sc.next().charAt(0);

        switch (letter) {

            case 'a', 'A':
                System.out.println("It's a Vowel");
                break;
            case 'e', 'E':
                System.out.println("It's a Vowel");
                break;
            case 'i', 'I':
                System.out.println("It's a Vowel");
                break;
            case 'o', 'O':
                System.out.println("It's a Vowel`");
                break;
            case 'u', 'U':
                System.out.println("It's a Vowel");
            default:
                System.out.println("It's a Consonant");

        }


    }
}

package com.blz.day2problem;

import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the  Month = ");
        int Month = sc.nextInt();
        System.out.print("Enter the Day = ");
        int Day = sc.nextInt();


        if ((Month <= 0 || Month >= 13 || Day <= 0 || Day >= 32) || (Month == 4 && Day >= 31)) {
            System.out.println("invalid");
        } else if ((Month == 3 && Day >= 20 && Day <= 31) ||
                (Month == 4 && Day <= 31) ||
                (Month == 5 && Day <= 31) ||
                (Month == 6 && Day <= 20)) {
            System.out.println("This is the Spring Season ");
        } else

            System.out.println("This Season is not Spring Season ");
    }
}
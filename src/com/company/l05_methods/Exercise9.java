package com.company.l05_methods;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Exercise9 myApp = new Exercise9();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("That is: " + myApp.sum(n) );
    }

    private int powerOf10(int n){
        if (n == 0){
            return 1;
        }
        return powerOf10(n -1) * 10;
    }

    private int sum(int n){
        if (n >= 1){
            return sum(n-1) + n;
        }
        return n;
    }
}

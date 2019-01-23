package com.company.l05_methods;

import java.util.Scanner;

public class Exercise1 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Exercise1 myApp = new Exercise1();

        int a, b, c;

        System.out.println("Please enter three numbers: ");
        a = myApp.input.nextInt();
        b = myApp.input.nextInt();
        c = myApp.input.nextInt();

        int smallest = myApp.findSmallest(a, b, c);
        int biggest = myApp.findBiggest(a, b, c);
        double average = myApp.findAverage(a, b, c);
        int sum = myApp.findSum(a, b, c);

        System.out.printf("" +
                "Smallest: %d%n" +
                "Biggest: %d%n" +
                "Average: %.1f%n" +
                "Sum: %d",
                smallest, biggest, average, sum);
    }

    private int findSmallest(int a, int b, int c){

        if (a < b && a < c){
            return a;
        } else if (b < a && b < c){
            return b;
        } else {
            return c;
        }
    }

    private int findBiggest (int a, int b, int c){

        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }

    private double findAverage(int a, int b, int c){
        return (a + b + c) / 3;
    }

    private int findSum (int a, int b, int c){
        return a + b + c;
    }
}

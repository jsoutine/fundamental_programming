package com.company.l05_methods;

import java.util.Scanner;

public class Task7 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Task7 myApp = new Task7();

        int sum = myApp.add(5, 6);
        double sum2 = myApp.add(3.14, 2.32);

        System.out.println("The answer is: " + sum +" and " + sum2);
    }

    private int add(int a, int b){
        return a + b;
    }

    private double add (double a, double b){
        return a + b;
    }
}

package com.company.l05_methods;

import javafx.concurrent.Task;

import java.util.Scanner;

public class Task9 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;

        Task9 myApp = new Task9();
        System.out.println("Enter three numbers: ");
        a = myApp.input.nextInt();
        b = myApp.input.nextInt();
        c = myApp.input.nextInt();

        int sum = myApp.algorithm(a, b, c);
        System.out.println(sum);
    }

    private int algorithm(int a, int b, int c){
        return a * b + c;
    }
}

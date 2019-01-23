package com.company.l05_methods;

import java.util.Scanner;

public class Task6 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int answer;

        Task6 myApp = new Task6();
        answer = myApp.theNumber();
        System.out.println(answer);
    }

    private int theNumber(){
        System.out.println("Enter a number: ");
        return input.nextInt();
    }
}

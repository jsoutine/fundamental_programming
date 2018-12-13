package com.company.l04_control_flow;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a value: ");
        int value = input.nextInt();

        if (value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}

package com.company.l04_control_flow;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a decimal number: ");
        double value = input.nextDouble();

        if (value > 0 && value < 5) {
            System.out.println("Small");
        } else if (value >= 5 && value <= 10) {
            System.out.println("bigger");
        } else {
            System.out.println("not valid");
        }
    }
}

package com.company.l06_data_structures;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] value = new double[5];

        System.out.println("Enter 5 values.");

        for (int i = 0; i < value.length; i++ ) {
            System.out.println("Value " + (i + 1) + ": ");
            value[i] = input.nextDouble();
        }

        System.out.println("Enter a number between 0 and 4: ");
        int choice = input.nextInt();

        System.out.println("The value at your chosen location is: " + value[choice]);
    }
}

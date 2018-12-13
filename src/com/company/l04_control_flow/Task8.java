package com.company.l04_control_flow;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a message: ");
        String message = input.nextLine();

        System.out.println("How many times would you like to have it displayed: ");
        int repetitions = input.nextInt();

        for (int i = 0; i < repetitions; i++) {
            System.out.println(message);
        }

        System.out.println();

        while (repetitions > 0) {
            System.out.println(message);
            repetitions--;
        }
    }

}

package com.company.l04_control_flow;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value = 0;

        while (value >=0) {
            System.out.println("Please enter a number: ");
            value = input.nextInt();
        }

        do{
            System.out.println("Please enter a number: ");
            value = input.nextInt();
        }while (value >= 0);

    }
}

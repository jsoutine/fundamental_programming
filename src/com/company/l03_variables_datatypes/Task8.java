// Task 8
// Checks if numbers are equal, then prints if they are.

package com.company.l03_variables_datatypes;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = input.nextInt();

        System.out.println("Now enter another one: ");
        int b = input.nextInt();

        //made an if statement to get flashy
        if (a == b){
            System.out.println("They are identical.");
        } else {
            System.out.println("They don't match");
        }
    }
}

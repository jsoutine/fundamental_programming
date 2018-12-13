// Task 6
// Reads two numbers from the user and adds them together.

package com.company.l03_variables_datatypes;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int a = input.nextInt();

        System.out.print("Now enter another one: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("The sum of your numbers is: " + sum);

    }
}

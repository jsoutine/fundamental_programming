// Task 10
// Divides 5/2 with int and double

package com.company.l03_variables_datatypes;

public class Task10 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        double x = 5;
        double y = 2;
        int sumInt = a / b;

        // observation: if only one of the numbers is a double it'll calculate correctly.
        double sumDouble = x / y;

        System.out.println(sumInt + "\n" + sumDouble);

    }
}

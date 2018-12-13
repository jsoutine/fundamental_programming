// Exercise 1
// Takes the users name, amount of money and interest rate.

package com.company.l03_variables_datatypes;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your civic number; ");
        String civicNumber = input.nextLine();

        System.out.print("Enter amount of money: ");
        int balance = input.nextInt();

        System.out.print("Enter interest rate: ");
        double interest = input.nextDouble();

        double newBalance = calcBalance(balance, interest);

        System.out.printf("%n%nYour information: %nName: %s %nCivic number: %s %nBalance: %d %nInterest rate: %.2f %%" +
                "%nAfter one year your balance will be: %.2f%n%n", name, civicNumber, balance, interest, newBalance);

        System.out.print("How much would you like to deposit: ");
        int deposit = input.nextInt();

        System.out.print("How much would you like to withdraw: ");
        int withdrawal = input.nextInt();

        balance += deposit - withdrawal;

        System.out.printf("Your new balance is: %d", balance);
    }

    private static double calcBalance(int balance, double interest) {
        return balance * (interest / 100 + 1);
    }
}

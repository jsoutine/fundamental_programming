package com.company.l04_control_flow;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int balance = 1000;

        System.out.println("How much would you like to withdraw? Only use even 100's: ");
        int withdrawal = input.nextInt();

        while (withdrawal%100 != 0) {
            System.out.println("Only even 100's biatch. Try again: ");
            withdrawal = input.nextInt();
        }

        if (balance - withdrawal < 0){
            System.out.println("You don't have that much, your current balance is " + balance + " SEK");
        } else {
            balance -= withdrawal;
            System.out.println("Thank you, your new balance is: " + balance + " SEK");
        }
    }
}

package com.company.l04_control_flow;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean correct = false;
        boolean yesOrNo = false;

        do {
            System.out.println();
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your phone number: ");
            String phoneNumber = input.nextLine();

            System.out.print("Enter your address: ");
            String address = input.nextLine();

            System.out.printf("\nThe information you have entered is:%n" +
                            "Name: %s%n" +
                            "Phone number: %s%n" +
                            "Address: %s%n"
                    , name, phoneNumber, address);

            do {
                System.out.println("\nIs this information correct?");
                String reply = input.nextLine();

                switch (reply.toLowerCase()) {
                    case "yes":
                        System.out.println("\nGreat, thanks");
                        correct = true;
                        yesOrNo = true;
                        break;

                    case "no":
                        System.out.println("\nOk, try again.\n");
                        yesOrNo = true;
                        break;

                    default:
                        System.out.println("Please enter \"yes\" or \"no\": ");
                        yesOrNo = false;
                }
            }while (!yesOrNo);

        } while (!correct);
    }
}

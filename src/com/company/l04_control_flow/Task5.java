package com.company.l04_control_flow;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you ready? ");
        String reply = input.nextLine();
        reply = reply.toLowerCase();

        switch (reply) {
            case "yes":
                System.out.println("Good");
                break;

            case "no":
                System.out.println("Bad!");
                break;
                
            default :
                System.out.println("Error!");
        }
    }
}

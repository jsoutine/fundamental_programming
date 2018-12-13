package com.company.l04_control_flow;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    Scanner input = new Scanner(System.in);

    ArrayList accounts = new ArrayList();

    public static void main(String[] args) {

        Exercise3 myApp = new Exercise3();

        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "----Welcome to Bank of HKR----",
                "1) New account",
                "2) View account",
                "3) Deposit",
                "4) Withdraw",
                "5) Exit");

        int menuSelection = myApp.input.nextInt();

        switch (menuSelection){
            case 1:
                myApp.input.nextLine();
                Person p1 = myApp.newAccount();
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;
        }
    }

    private Person newAccount(){

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        Person p1 = new Person(name, phoneNumber, address);

        String Account = ("Welcome %s");

        return p1;
    }
}

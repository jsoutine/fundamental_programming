package com.company.l04_control_flow;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    private Scanner input = new Scanner(System.in);
    private ArrayList<Person> accounts = new ArrayList<>();


    public static void main(String[] args) {
        Exercise3 myApp = new Exercise3();
        boolean exit = false;
        int accountNumber;
        double balance;

        do {
            System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "----Welcome to Bank of HKR----",
                    "1) New account",
                    "2) View account",
                    "3) Deposit",
                    "4) Withdraw",
                    "5) Exit");

            String menuSelection = myApp.input.nextLine();

            switch (menuSelection) {
                case "1":
                    Person p1 = myApp.newAccount();
                    myApp.accounts.add(p1);
                    break;
                case "2":
                    myApp.chooseAccount();
                    break;
                case "3":
                    accountNumber = myApp.chooseAccount();
                    balance = myApp.deposit(accountNumber);
                    System.out.printf("%n%s%s%s%.2f%s%n", "Thank you ", myApp.accounts.get(accountNumber).getName(), ". Your balance is now ", balance, " SEK");
                    myApp.input.nextLine();
                    break;
                case "4":
                    accountNumber = myApp.chooseAccount();
                    balance = myApp.withdraw(accountNumber);
                    System.out.printf("%n%s%s%.2f%s%n", myApp.accounts.get(accountNumber).getName(), ", your balance is currently ", balance, " SEK");
                    myApp.input.nextLine();
                    break;
                case "5":
                    System.out.println("Thank you, please come again.");
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter an option of 1-5.");
                    exit = false;
            }
        } while (!exit);
    }

    private Person newAccount() {

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your current balance: ");
        double balance = input.nextDouble();
        input.nextLine();

        Person p1 = new Person(name, phoneNumber, address, balance);

        System.out.printf("%nWelcome %s%n", p1.getName());

        return p1;
    }

    private int chooseAccount() {

        int accountNumber = 1;


        if (accounts.size() > 0) {
            System.out.println("Which account would you like to choose?");

            for (int i = 0; i < accounts.size(); i++)
                System.out.println(i + 1 + ": " + accounts.get(i).getName());
        } else {
            System.out.println("There are no accounts.");
            return 0;
        }
        try {
            accountNumber = input.nextInt() - 1;
            System.out.println(accounts.get(accountNumber));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No account with that number. Try again.");
        }
        input.nextLine();
        return accountNumber;
    }

    private double deposit(int accountNumber) {
        System.out.println("How much would you like to deposit?");
        double sum = input.nextDouble();
        accounts.get(accountNumber).setBalance(accounts.get(accountNumber).getBalance() + sum);
        return accounts.get(accountNumber).getBalance();
    }

    private double withdraw(int accountNumber) {
        System.out.println("How much would you like to withdraw?");
        double sum = input.nextDouble();

        if (accounts.get(accountNumber).getBalance() - sum >= 0) {
            accounts.get(accountNumber).setBalance(accounts.get(accountNumber).getBalance() - sum);
            System.out.println("Withdrawal successful");
            return accounts.get(accountNumber).getBalance();
        } else {
            System.out.println("Sorry you do not have sufficient funds in your account.");
            return accounts.get(accountNumber).getBalance();
        }
    }
}


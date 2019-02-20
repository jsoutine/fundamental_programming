/*
package com.company.l08_software_design.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private enum Filter {ALL, FRIENDS, COLLEAGUES}

    private Scanner input = new Scanner(System.in);
    private ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Main myApp = new Main();
        int choice;

        do {
            myApp.printMenu();
            System.out.print(">> ");
            choice = myApp.input.nextInt();

            switch (choice) {
                case 1:
                    myApp.addContact();
                    break;
                case 2:
                    myApp.removeContact();
                    break;
                case 3:
                    myApp.viewContacts(Filter.FRIENDS);
                    break;
                case 4:
                    myApp.viewContacts(Filter.COLLEAGUES);
                    break;
                case 5:
                    myApp.viewContacts(Filter.ALL);
                    break;
                case 6:
                    myApp.search();
                    break;
            }
        } while (choice != 7);

    }

    private void printMenu() {
        System.out.println();
        System.out.println("*--------------------*");
        System.out.println("| 1. Add contact     |");
        System.out.println("| 2. Remove contact  |");
        System.out.println("| 3. View Friends    |");
        System.out.println("| 4. View Colleagues |");
        System.out.println("| 5. View All        |");
        System.out.println("| 6. Search          |");
        System.out.println("| 7. Exit            |");
        System.out.println("*--------------------*");
        System.out.println();
    }

    private void addContact() {
        String type;
        String firstName, lastName, mobile, nickName;
        String[] lastEmployers = new String[3];

        System.out.println();
        System.out.print("(F)riend or (C)olleague? ");
        type = input.next();

        System.out.print("First name   : ");
        firstName = input.next();
        System.out.print("Last name    : ");
        lastName = input.next();
        System.out.print("Phone number : ");
        mobile = input.next();

        if (type.equals("F")) {
            System.out.print("Nickname     : ");
            nickName = input.next();
            contacts.add(new Friend(firstName, lastName, mobile, nickName));
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.format("Employer [%d] : ", i);
                lastEmployers[i] = input.next();
            }
            contacts.add(new Colleague(firstName, lastName, mobile, lastEmployers));
        }
    }

    private void removeContact() {
        int index;

        System.out.println();
        for (int i = 0; i < contacts.size(); i++) {
            System.out.format("[%d] %-15s %s%n", i, contacts.get(i) instanceof Friend ? "Friend" : "Colleague",
                    contacts.get(i).getFirstName() + " " + contacts.get(i).getLastName());
        }

        System.out.print("Index to delete? ");
        index = input.nextInt();

        contacts.remove(index);
    }

    private void viewContacts(Filter type) {
        for (Contact c : contacts) {
            if (c instanceof Colleague && (type == Filter.ALL || type == Filter.COLLEAGUES)) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
                System.out.println("\t" + c.getMobile());
                for(int i=0;i < 3;i++) {
                    System.out.println("\tEmp[" + i + "] = " + ((Colleague) c).getLastEmployers()[i]);
                }
            } else if(c instanceof Friend && (type == Filter.ALL || type == Filter.FRIENDS)) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
                System.out.println("\t" + c.getMobile());
                System.out.println("\t" + ((Friend) c).getNickName());
            }
            System.out.println();
        }
    }

    private void search() {
        String search;

        System.out.print("What text do you want to search for? ");
        search = input.next();

        System.out.println("The following contacts name start with '" + search + "'");
        printStartWith(contacts, search);
        System.out.println();
        System.out.println("The following contacts name contain '" + search + "'");
        printContains(contacts, search);
    }

    private void printStartWith(ArrayList<Contact> list, String s) {
        list.stream()
                .map(c -> c.getFirstName() + " " + c.getLastName())
                .filter(e -> e.toLowerCase().startsWith(s.toLowerCase()))
                .forEach(System.out::println);
    }

    private void printContains(ArrayList<Contact> list, String s) {
        list.stream()
                .map(c -> c.getFirstName() + " " + c.getLastName())
                .filter(e -> e.toLowerCase().contains(s.toLowerCase()))
                .forEach(System.out::println);
    }
}
*/

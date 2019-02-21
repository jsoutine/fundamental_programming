/*
 * Would've been much smoother if I had just put the arraylist above the main method.
 * */

package com.company.l08_software_design.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Task1 myApp = new Task1();
        ArrayList<Contact> contacts = new ArrayList<>();

        System.out.println("\n===WELCOME===");

        while (true) {
            System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "Enter your choice",
                    "1. Add contact",
                    "2. Remove contact",
                    "3. View Contacts",
                    "4. Search for contacts",
                    "5. Exit");
            String select = myApp.input.nextLine();

            switch (select) {
                case "1":
                    contacts.add(myApp.addContact());
                    break;
                case "2":
                    contacts.remove(myApp.deleteContact(contacts));
                    break;
                case "3":
                    myApp.viewContact(contacts);
                    break;
                case "4":
                    myApp.searchContacts(contacts);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Please enter a valid choice of 1-5");
            }
        }
    }

    private Contact addContact() {

        String choice;
        String[] employerList = new String[3];

        System.out.println("\nPlease input contact information");

        System.out.println(
                "Is this a private or work contact?\n" +
                        "1. Private\n" +
                        "2. Work\n");
        choice = input.nextLine();

        System.out.print("First name: ");
        String firstName = input.nextLine();
        System.out.print("Last name: ");
        String lastName = input.nextLine();
        System.out.print("Mobile number: ");
        String mobileNumber = input.nextLine();

        if (choice.equals("1")) {
            System.out.print("Nickname: ");
            String nickName = input.nextLine();
            return new PrivateContact(firstName, lastName, mobileNumber, nickName);
        } else {
            System.out.println("Enter three previous employers: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Employer " + (i + 1) + ": ");
                employerList[i] = input.nextLine();
            }
            return new WorkContact(firstName, lastName, mobileNumber, employerList);
        }
    }

    private Contact deleteContact(ArrayList<Contact> contacts) {

        System.out.print("Who would you like to delete: ");
        String name = input.nextLine();

        for (Contact c : contacts) {
            if (name.equals(c.getFirstName()) || name.equals(c.getLastName())) {
                System.out.println(c.getFirstName() + " has been removed");
                return c;
            }
        }
        System.out.println("Sorry, that person is not on the list.");
        return null;
    }

    private void viewContact(ArrayList<Contact> contacts) {
        System.out.printf("%n%s%n%s%n%s%n%s%n",
                "Which would you like to view",
                "1. Private contacts",
                "2. Work contacts",
                "3. All contacts");
        String select = input.nextLine();

        switch (select) {

            case "1":
                for (Contact c : contacts)
                    if (c instanceof PrivateContact) {
                        System.out.println(c.getFirstName() + " " + c.getLastName());
                    }
                break;
            case "2":
                for (Contact c : contacts)
                    if (c instanceof WorkContact)
                        System.out.println(c.getFirstName() + " " + c.getLastName());
                break;
            case "3":
                for (Contact c : contacts)
                    System.out.println(c.getFirstName() + " " + c.getLastName());
                break;
            default:
                System.out.println("Please enter a valid option.");
        }
    }

    private void searchContacts(ArrayList<Contact> contacts) {
        System.out.println("Who are you looking for: ");
        String name = input.nextLine();

        for (Contact c : contacts) {
            if (name.equals(c.getFirstName()) || name.equals(c.getLastName())) {
                System.out.println("Result: \n" + c);
                return;
            }
        } System.out.println("Sorry, couldn't find that dude.");
    }
}

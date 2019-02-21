package com.company.seminar3.task1;


import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> author = new ArrayList<>();
        Book[] books = new Book[3];

        String title;
        int ISBN;
        int price;
        boolean more = true;
        int count = 0;

        while (more) {
            System.out.println("\nEnter first author: ");
            author.add(input.nextLine());
            System.out.println("Enter second author: ");
            author.add(input.nextLine());
            System.out.println("Enter Title: ");
            title = input.nextLine();
            System.out.println("Enter ISBN: ");
            ISBN = input.nextInt();
            System.out.println("Enter price: ");
            price = input.nextInt();
            input.nextLine();
            Book newBook = new Book(author, title, ISBN, price);
            books[count] = newBook;
            System.out.println("\n" +
                    "Information entered.\n" +
                    "Would you like to enter another book?\n" +
                    "(Y)es\n" +
                    "(N)o");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                more = true;
                count++;
            } else {
                more = false;
            }
        }

        for (int i = 0; i <= count; i++) {
            author = books[i].getAuthor();
            title = books[i].getTitle();
            ISBN = books[i].getISBN();
            price = books[i].getPrice();

            String formattedAuthor = author.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .trim();

            System.out.printf("%n%s%s%n%s%s%n%s%s%n%s%s%s%n",
                    "Author: ", author,
                    "Title: ", title,
                    "ISBN: ", ISBN,
                    "Price: ", price, " SEK");
        }
    }
}

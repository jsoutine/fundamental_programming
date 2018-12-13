// Lesson 5 Task 1
// This program uses a method to print Hello World
package com.company.l05_methods;


public class Task1 {

    public static void main(String[] args) {

        Task1 myApp = new Task1();

        myApp.print();
        myApp.printQuote();
        myApp.printQuote();

        myApp.printParam("This text is a parameter");
    }

    private void print() {
        System.out.println("Hello World");
    }

    private void printQuote() {
        System.out.println("Oh. Yes. Little\nBobby tables, \nwe call him. \n--xkcd: Exploits of a Mom.");
    }

    private void printParam(String s){
        System.out.println(s);
    }
}

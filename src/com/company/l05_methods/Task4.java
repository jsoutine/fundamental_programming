package com.company.l05_methods;

public class Task4 {
    public static void main(String[] args) {

        Task4 myApp = new Task4();
        myApp.printTwoParams(5,10);

    }
    private void printTwoParams(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

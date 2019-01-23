package com.company.l05_methods;

public class Task4 {
    public static void main(String[] args) {

        Task4 myApp = new Task4();
        myApp.printTwoParams(5,10);
        myApp.printDoubles(0.5,5.7,100.8);

    }
    private void printTwoParams(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    private void printDoubles(double a, double b, double c){
        System.out.printf("%.2f, %.2f, %.2f %n%f%n%f%n%f%n", a, b, c, a, b, c );
    }
}

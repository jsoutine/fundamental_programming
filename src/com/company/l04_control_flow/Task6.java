package com.company.l04_control_flow;

public class Task6 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        System.out.println();

        while (counter < 10){
            System.out.println("Hello World");
            counter ++;
        }

        System.out.println();

        do {
            System.out.println("Hello World");
            counter --;
        } while (counter > 0);
    }
}
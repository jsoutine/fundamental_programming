package com.company.l04_control_flow;

public class Task11 {
    public static void main(String[] args) {

        int counter = 1;

        for (int i = 0; i < 100; i++) {

            System.out.println(counter);
            counter += 2;
        }

        while (counter > 0){

            System.out.println(counter);
            counter -= 2;
        }
    }
}

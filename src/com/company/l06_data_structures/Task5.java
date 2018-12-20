package com.company.l06_data_structures;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Enter five words: ");

        for (int i = 0; i < 5; i++){
            System.out.println("Word " + (i + 1) + ": ");
            words[4 - i] = input.nextLine();
        }

        System.out.println("your words were: ");

        for (String s : words){
            System.out.print(s + " ");
        }
    }
}

package com.company.l06_data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("Enter five words: ");

        for(int i = 0; i < 5; i++){
            System.out.printf("Word %d: ", (i + 1));
            word = input.nextLine();
            strings.add(word);
        }

        strings.remove(1);

        for (String s: strings){
            System.out.print(s + " ");
        }
    }
}

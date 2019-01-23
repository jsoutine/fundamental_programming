package com.company.l06_data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();

        int value = 0;

        while (value >= 0){

            System.out.println("Please enter an integer: ");
            value = input.nextInt();
            values.add(value);
        }

        for (int i : values){
            System.out.println(i);
        }
    }
}

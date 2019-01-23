package com.company.l06_data_structures;

public class Task1 {
    public static void main(String[] args) {

        int[] values = new int[5];

        values[0] = 5;
        values[1] = 4;

        for (int i = 2; i < 5; i++) {
            values[i] = 5 - i;
        }

        for (int i = 0; i < values.length; i++ ){
            System.out.println(values[i]);
        }

        int i = 0;
        while (i < values.length){
            System.out.println(values[i]);
            i ++;
        }


        for (int x: values){
            System.out.println(x);
        }
    }
}

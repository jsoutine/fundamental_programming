package com.company.l06_data_structures;

import java.security.SecureRandom;

public class Task12 {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        int[] x = new int[100];
        int[] y = new int[100];
        int[] z = new int[100];

        for(int i = 0; i < x.length; i++){
            x[i] = random.nextInt(100);
            y[i] = random.nextInt(100);
            z[i] = (x[i] * y[i]);
        }

        for (int i = 0; i < 100; i++)
        System.out.printf("%d * %d = %d%n", x[i], y[i], z[i]);
    }
}

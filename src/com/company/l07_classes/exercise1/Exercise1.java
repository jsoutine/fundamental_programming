package com.company.l07_classes.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setName("Annika");
        e1.setSSN("830203");
        e1.setAddress("Hästhagen 2");
        e1.setPhoneNumber("09834509");

        do {
            System.out.printf("What salary would you like %s to have?%n", e1.getName());
            e1.setSalary(input.nextDouble());
        } while (!e1.isValid());

        e2.setName("Tommy");
        e2.setSSN("880604");
        e2.setAddress("Hästhagen 2");
        e2.setPhoneNumber("0984545");

        do {
        System.out.printf("What salary would you like %s to have?%n", e2.getName());
        e2.setSalary(input.nextDouble());
        } while (!e2.isValid());

        people.add(e1);
        people.add(e2);

        for (Object o : people) {
            System.out.println(o);
        }
    }
}

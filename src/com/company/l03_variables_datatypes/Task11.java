// Task 11
// Interacts with class person.

package com.company.l03_variables_datatypes;

public class Task11 {

    public static void main(String[] args) {

        Person p1 = new Person("Julius", 37);
        Person p2 = new Person("Cilla", 25);

        System.out.printf("The first person is %s who is %d years old. %nThe second person is %s, who is %d years old."
                ,p1.getName(), p1.getAge(), p2.getName(), p2.getAge());

    }
}

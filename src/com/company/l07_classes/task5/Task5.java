package com.company.l07_classes.task5;

public class Task5 {
    public static void main(String[] args) {

        Person p1 = new Person("Jim", "Live death", 33, Person.Month.Jan);
        Person p2 = new Person("John", "Holey Moley", 89, Person.Month.Aug);
        Student s1 = new Student("Moe","Yo",33, Person.Month.Jul);

        s1.setGrade('A');

        System.out.printf("%s is %d years old.%n", p1.getName(), p1.getAge());
        System.out.printf("%s is %d years old.%n",p2.getName(), p2.getAge());

        p1.printMotto();
        p2.printMotto();

        System.out.printf("%s is %d years old with the motto %s and grade %c. He was born in %s.", s1.getName(),s1.getAge(),s1.getMotto(),s1.getGrade(),s1.getMonth());
    }
}

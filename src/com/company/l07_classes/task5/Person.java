package com.company.l07_classes.task5;

public class Person {
    public enum Month {Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Okt, Nov, Dec}

    private String name;
    private String motto;
    private int age;
    private Month month;

    public Person(String name, String motto, int age, Month month) {
        this.name = name;
        this.age = age;
        this.motto = motto;
        this.month = month;

    }

    public String getName() {
        return name;
    }

    public String getMotto() {
        return motto;
    }

    public int getAge() {
        return age;
    }

    public Month getMonth(){
        return month;
    }

    public void printMotto() {
        System.out.println(motto);
    }
}

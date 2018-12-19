package com.company.l07_classes.task5;

public class Student extends Person {

    public Student(String name, String motto, int age, Month month) {
        super(name, motto, age, month);
    }

    private char grade;

    public void setGrade(char grade){
        this.grade = grade;
    }

    public char getGrade(){
        return grade;
    }
}

package com.company.l05_methods;

public class Task13 {

    public static void main(String[] args) {

        Task13 myApp = new Task13();
        System.out.println(myApp.methodA());
    }

    private String methodA(){
        return "methodA" + " " + methodB();
    }
    private String methodB(){
        return "methodB";
    }
}

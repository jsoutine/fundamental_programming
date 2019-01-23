package com.company.l04_control_flow;

public class Person {

    private String name;
    private String phoneNumber;
    private String address;
    private double balance;

    public Person(String name, String phoneNumber, String address, double balance) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%n" +
                        "Name: %s%n" +
                        "Address: %s%n" +
                        "Phone number: %s%n" +
                        "Balance: %.2f SEK%n"
                , this.getName(), this.getAddress(), this.getPhoneNumber(), this.getBalance());
    }
}


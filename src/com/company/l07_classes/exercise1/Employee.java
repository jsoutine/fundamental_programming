package com.company.l07_classes.exercise1;

public class Employee extends Person {
    private double salary;
    private boolean valid;

    private double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("The Employee salary can't be less than zero. Try again.\n");
            valid = false;
        } else {
            this.salary = salary;
            valid = true;
        }
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return String.format("%nName: %s%nSSN: %s%nAddress: %s%nPhone number: %s%nSalary: %.2f SEK"
                , this.getName(), this.getSSN(), this.getAddress(), this.getPhoneNumber(), this.getSalary());
    }
}

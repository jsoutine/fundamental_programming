package com.company.l08_software_design.task1;

public abstract class Contact {

    private final String firstName;
    private final String lastName;
    private final String mobileNumber;

    public Contact (String firstName, String lastName, String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

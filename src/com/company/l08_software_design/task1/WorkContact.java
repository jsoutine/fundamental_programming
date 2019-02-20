package com.company.l08_software_design.task1;

public class WorkContact extends Contact {

    private String[] employerList;

    public WorkContact(String firstName, String lastName, String mobileNumber, String[] employerList) {
        super(firstName, lastName, mobileNumber);
        this.employerList = employerList;
    }

    @Override
    public String toString(){
        return String.format("%n%s %s %nMobile Number: %s %nEmployers: %s, %s, %s%n",getFirstName(), getLastName(), getMobileNumber(), employerList[0], employerList[1], employerList[2]);
    }
}
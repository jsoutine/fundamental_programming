package com.company.l08_software_design.task1;

public class PrivateContact extends Contact {

   private String nickName;

   public PrivateContact (String firstName, String lastName, String mobileNumber, String nickName){
        super(firstName, lastName, mobileNumber);
        this.nickName = nickName;
   }

    @Override
    public String toString() {
        return String.format("%n%s %s %nMobile Number: %s %nNickname: %s%n",getFirstName(), getLastName(), getMobileNumber(), nickName);
    }
}

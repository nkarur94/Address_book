package com.bridgelabz;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String eMail;
    int phoneNumber;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zipCode, String eMail, int phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
    }
}
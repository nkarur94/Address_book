package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {
    /*
     */
    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);

        System.out.print("ENTER THE FIRSTNAME:");
        String firstName=userInput.nextLine();

        System.out.print("ENTER THE LASTNAME:");
        String lastName=userInput.nextLine();

        System.out.print("ENTER THE ADDRESS:");
        String address=userInput.nextLine();

        System.out.print("ENTER THE CITY:");
        String city=userInput.nextLine();

        System.out.print("ENTER THE STATE:");
        String state=userInput.nextLine();

        System.out.print("ENTER THE ZIPCODE:");
        int zipCode=userInput.nextInt();
        userInput.nextLine();

        System.out.print("ENTER THE EMAIL:");
        String eMail=userInput.nextLine();

        System.out.print("ENTER THE PHONE NUMBER:");
        int phoneNumber=userInput.nextInt();

        Contacts Contacts=new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber );




    }
}

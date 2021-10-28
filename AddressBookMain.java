package com.bridgelabz;
import javax.swing.*;
import java.util.*;

public class AddressBookMain {
    /*@ArrayList has used to save the data inrespective of the size
    /@Scanner class is been called to take the input from the user
    /@do while loop to perform the end less process of inserting, displaying etc.. functions it will only exit if we enter 0
     /@ switch statements are used to handle the choice made my user
     /@contactAdd.add function is used to add the object type data to the ArrayList object
     /@iterator class used to get the content from the object one by one
     */
    public static void main(String[] args) {
        String firstName=null;
        String lastName=null;
        String address=null;
        String city=null;
        String state=null;
        int zipCode=0;
        String eMail=null;
        long phoneNumber=0;

        Contacts adding=new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber );
        ArrayList <Contacts> contactsAdd=new ArrayList<>();

        Scanner userInput=new Scanner(System.in);

        int choice=-1;
        do {
            System.out.println("1:INSERT");
            System.out.println("2:DISPLAY");
            System.out.println("3:EDIT");
            System.out.println("4:DELETE");
            System.out.println("0: EXIT");

            System.out.println("ENTER YOUR CHOICE :");
            choice=userInput.nextInt();

            switch(choice){
                case 1:
                    adding.addContact();
                break;

                case 2:
                   adding.display();
                break;

                case 3:
                    adding.editing();
                break;

                case 4:
                    adding.deleting();
                    break;

            }


        }while (choice !=0);


    }
}

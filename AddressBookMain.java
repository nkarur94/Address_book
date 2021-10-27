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
        ArrayList <Contacts> contactsAdd=new ArrayList<>();
        Scanner userInput=new Scanner(System.in);
        Scanner userInputString=new Scanner(System.in);

        int choice=-1;
        do {
            System.out.println("1:INSERT");
            System.out.println("2:DISPLAY");
            System.out.println("3:EDIT");
            System.out.println("0: EXIT");

            System.out.println("ENTER YOUR CHOICE :");
            choice=userInput.nextInt();

            switch(choice){
                case 1:
                    System.out.print("ENTER YOUR FIRSTNAME :");
                    String firstName=userInputString.nextLine();

                    System.out.print("ENTER YOUR LASTNAME :");
                    String lastName=userInputString.nextLine();

                    System.out.print("ENTER YOUR ADDRESS :");
                    String address=userInputString.nextLine();

                    System.out.print("ENTER YOUR CITY :");
                    String city=userInputString.nextLine();

                    System.out.print("ENTER YOUR STATE :");
                    String state=userInputString.nextLine();

                    System.out.print("ENTER YOUR ZIPCODE :");
                    int zipCode=userInput.nextInt();

                    System.out.print("ENTER YOUR EMAIL ID :");
                    String eMail=userInputString.nextLine();

                    System.out.print("ENTER YOUR PHONE NUMBER :");
                    long phoneNumber=userInput.nextLong();

                    contactsAdd.add(new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber ));
                break;
                case 2:
                    Iterator <Contacts> displayItems=contactsAdd.iterator();
                    while(displayItems.hasNext()){
                        Contacts show=displayItems.next();
                        System.out.println(show);
                    }

                    break;
                case 3:
                    boolean found=false;
                    Iterator <Contacts> editingMood=contactsAdd.iterator();

                    System.out.println("ENTER THE FIRST NAME FOR EDITING");
                    firstName=userInputString.nextLine();
                    while(editingMood.hasNext()) {
                        Contacts data = editingMood.next();
                        if ((data.firstName).equals(firstName)) {
                            int index= contactsAdd.indexOf(data);
                            lastName = data.lastName;
                            System.out.println("ENTER THE NEW ADDRESS");
                            address = userInputString.nextLine();

                            System.out.println("ENTER THE NEW CITY");
                            city = userInputString.nextLine();

                            System.out.println("ENTER THE NEW STATE");
                            state = userInputString.nextLine();

                            System.out.println("ENTER THE NEW ZIP CODE");
                            zipCode = userInput.nextInt();

                            System.out.println("ENTER THE NEW EMAIL ID");
                            eMail = userInputString.nextLine();

                            System.out.println("ENTER THE NEW PHONE NUMBER");
                            phoneNumber = userInput.nextInt();

                            contactsAdd.set(index, new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber));
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("not found");
                    }
                    else
                        System.out.println("edited successfully");



            }

        }while (choice !=0);


    }
}

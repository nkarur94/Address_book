package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Contacts {
    Scanner userInput=new Scanner(System.in);

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String eMail;
    long phoneNumber;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zipCode, String eMail, long phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
    }
    ArrayList<Contacts> insideContact=new ArrayList<>();

    public void addContact() {
        System.out.println("enter the no of contacts you want to add");
        int noOfContacts = userInput.nextInt();
        userInput.nextLine();
        for (int i = 0; i < noOfContacts; i++) {
            System.out.print("ENTER YOUR FIRSTNAME :");
            firstName = userInput.nextLine();
            System.out.print("ENTER YOUR LASTNAME :");
            lastName = userInput.nextLine();
            System.out.print("ENTER YOUR ADDRESS :");
            address = userInput.nextLine();
            System.out.print("ENTER YOUR CITY :");
            city = userInput.nextLine();
            System.out.print("ENTER YOUR STATE :");
            state = userInput.nextLine();
            System.out.print("ENTER YOUR ZIPCODE :");
            zipCode = userInput.nextInt();
            userInput.nextLine();
            System.out.print("ENTER YOUR EMAIL ID :");
            eMail = userInput.nextLine();
            System.out.print("ENTER YOUR PHONE NUMBER :");
            phoneNumber = userInput.nextLong();
            userInput.nextLine();
            insideContact.add(new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber));
        }
    }


    public void display(){

        Iterator<Contacts> displayItems=insideContact.iterator();

        while(displayItems.hasNext()){
            Contacts show=displayItems.next();
            System.out.println(show);
        }

        if(displayItems.hasNext()==false){
            System.out.println("--NO MORE DETAILS TO DISPLAY--");
        }
    }

    public void editing(){

        boolean found=false;

        Iterator <Contacts> editingMood=insideContact.iterator();

        System.out.println("ENTER THE FIRST NAME FOR EDITING");
        firstName=userInput.nextLine();

        while(editingMood.hasNext()) {
            Contacts data = editingMood.next();

            if ((data.firstName).equals(firstName)) {
                int index= insideContact.indexOf(data);

                System.out.println("ENTER THE FIELD TO EDIT");
                System.out.println("1.LAST NAME");
                System.out.println("2.ADDRESS");
                System.out.println("3.CITY");
                System.out.println("4.STATE");
                System.out.println("5.ZIP CODE");
                System.out.println("6.EMAIL ID");
                System.out.println("7.PHONE NUMBER");

                System.out.println("ENTER YOUR CHOICE PLEASE");
                int editChoice=userInput.nextInt();
                    userInput.nextLine();

                switch(editChoice) {
                    case 1:
                        System.out.println("ENTER THE NEW lastname");
                        lastName = userInput.nextLine();
                        break;
                    case 2:
                        System.out.println("ENTER THE NEW ADDRESS");
                        address = userInput.nextLine();
                        break;
                    case 3:
                        System.out.println("ENTER THE NEW CITY");
                        city = userInput.nextLine();
                        break;
                    case 4:
                        System.out.println("ENTER THE NEW STATE");
                        state = userInput.nextLine();
                        break;
                    case 5:
                        System.out.println("ENTER THE NEW ZIP CODE");
                        zipCode= userInput.nextInt();
                        userInput.nextLine();
                        break;
                    case 6:
                        System.out.println("ENTER THE NEW EMAIL ID");
                        eMail = userInput.nextLine();
                        break;
                    case 7:
                        System.out.println("ENTER THE NEW PHONE NUMBER");
                        phoneNumber= userInput.nextLong();
                        userInput.nextLine();

                }
                insideContact.set(index, new Contacts(firstName, lastName, address, city, state, zipCode, eMail, phoneNumber));

                found = true;

            }
        }

        if (!found){
            System.out.println("not found");
        }
        else
            System.out.println("edited successfully");
    }

    public void deleting(){

        boolean deleteItemFound=false;

        Iterator <Contacts> deletingMood=insideContact.iterator();

        System.out.println("ENTER THE FIRSTNAME TO DELETE");
        String nameSearch=userInput.nextLine();

        while(deletingMood.hasNext()){
            Contacts dataD=deletingMood.next();
            if(nameSearch.equals(dataD.firstName)){
                deletingMood.remove();
                deleteItemFound=true;
            }
        }

        if(!deleteItemFound){
            System.out.println("not found");
        }
        else
            System.out.println("deleted successfully");
    }

    @Override
    public String toString() {
        return "CONTACTS-->\n" +
                " FIRST NAME='" + firstName + '\'' +
                ", LAST NAME='" + lastName + '\'' +
                "ADDRESS='" + address + '\'' +
                ", CITY='" + city + '\'' +
                ", STATE='" + state + '\'' +
                ", ZIP CODE=" + zipCode +
                ", EMAIL-ID='" + eMail + '\'' +
                ", PHONE NUMBER=" + phoneNumber
                ;
    }
}





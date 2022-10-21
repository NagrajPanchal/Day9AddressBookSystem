// UC-2 Add new contacts Details in Address Book System

package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
    List<Contact> contactList =new ArrayList<>();
    public void getContact(){
        Scanner inputContact=new Scanner(System.in);
        System.out.println("Enter the details of contact person");
        System.out.print("Enter First name : ");
        String firstName=inputContact.nextLine();
        System.out.print("Enter Last name : ");
        String lastName=inputContact.nextLine();
        System.out.print("Enter Address : ");
        String address=inputContact.nextLine();
        System.out.print("Enter City name : ");
        String city=inputContact.nextLine();
        System.out.print("Enter State name : ");
        String state=inputContact.nextLine();
        System.out.print("Enter zip-Code : ");
        String zipCode=inputContact.nextLine();
        System.out.print("Enter Phone Number : ");
        String phoneNumber=inputContact.nextLine();
        System.out.print("Enter Email ID : ");
        String email=inputContact.nextLine();
        Contact contact =new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        contactList.add(contact);
        System.out.println("Person '"+firstName+"' details inserted in contact List");
    }
    @Override
    public String toString() {
        return "Contact List= " + contactList;
    }
}
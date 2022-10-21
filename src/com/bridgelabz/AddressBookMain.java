// UC-1 Create Contacts Details in Address Book System

package com.bridgelabz;
public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("-:*@*  Wel-Come to Address book systems  *@*:-");
        System.out.println("Create Contacts Details");
        AddressBook addressBookObject = new AddressBook("Nagraj","Panchal","Shivanagar","Aurad","Karnataka","9739713842","585326","nagrajsubhashpanchal@gmail.com");
        System.out.println(addressBookObject);
    }
}
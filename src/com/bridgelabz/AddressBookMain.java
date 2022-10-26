// UC-3 Edit contacts Person Details in Address Book System

package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain
{
    public void switchOptions()
    {
        AddressBook addressBookObject = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n 1. Add \t 2. Edit \t 3. Delete \n 4. Print \t 5. Exit");
        System.out.print("Choose your options : ");
        int options = scanner.nextInt();
        do
        {
            switch (options)
            {
                case 1 :
                    System.out.println("Add Person Details ");
                    addressBookObject.getContact();
                    break;
                case 2 :
                    System.out.println("Edit Person contact details");
//                        addressBookObject.editPersonDetails();
                    addressBookObject.editContact();
                    break;
                case 3 :
                    System.out.println("Delete person contact list");
                    System.out.println("Enter the details of contact person");
                    addressBookObject.deleteContact();
                    break;
                case 4 :
                    System.out.println("Print Person Details");
                    System.out.println(addressBookObject.contactList);
                    break;
                case 5 :
                    System.out.println("Back from the Options");
                    break;
                default:
                    System.out.println("Invalid Key Options");
                    break;
            }
            System.out.println("\n 1. Add \t 2. Edit \t 3. Delete \n 4. Print \t 5. Exit");
            System.out.print("Choose your options : ");
            options = scanner.nextInt();
        }while (options != 5);
    }
    public static void main(String[] args)
    {
        System.out.println("-:*@*  Wel-Come to Address book systems  *@*:-");
        System.out.println("Create Contacts Details");
        AddressBookMain addressBookMainObject = new AddressBookMain();
        addressBookMainObject.switchOptions();
    }
}
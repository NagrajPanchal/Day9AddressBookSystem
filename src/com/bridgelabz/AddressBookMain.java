// UC-2 Add new contacts Details in Address Book System

package com.bridgelabz;

import java.util.Scanner;

import static javafx.application.Platform.exit;

public class AddressBookMain
{
    public void switchOptions()
    {
        AddressBook addressBookObject = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. Add \n 2. Print \n 3. Exit");
        System.out.print("Choose your options : ");
        int options = scanner.nextInt();
        do
        {
            switch (options) {
                case 1:
                    System.out.println("Add Person Details ");
                    addressBookObject.getContact();
                    break;
                case 2:
                    System.out.println("Print Person Details");
                    System.out.println(addressBookObject.contactList);
                    break;
                case 3:
                    System.out.println("Exit from option");
                    exit();
                    break;
                default:
                    System.out.println("Invalid Key Options");
                    exit();
                    break;
            }
            System.out.println(" 1. Add \n 2. Print \n 3. Exit");
            System.out.print("Choose your options : ");
            options = scanner.nextInt();
        }while (options != 3);
    }
    public static void main(String[] args)
    {
        System.out.println("-:*@*  Wel-Come to Address book systems  *@*:-");
        System.out.println("Create Contacts Details");
        AddressBookMain addressBookMainObject = new AddressBookMain();
        addressBookMainObject.switchOptions();
    }
}
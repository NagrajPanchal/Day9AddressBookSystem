// UC-5 Add multiple Person To Address Book
package com.bridgelabz;

import java.util.Scanner;
public class AddressBookMain
{
    public void switchOptions()
    {
        AddressBook addressBookObject = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. Add \t 2. Edit \n 3. Print \t 4. Exit");
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
                    System.out.println("Print Person Details");
                    System.out.println(addressBookObject.contactList);
                    break;
                case 4 :
                    System.out.println("Back from the Options");
                    break;
                default:
                    System.out.println("Invalid Key Options");
                    break;
            }System.out.println("\n 1. Add \t 2. Edit \n 3. Print \t 4. Exit");
            System.out.print("Choose your options : ");
            options = scanner.nextInt();
        }while (options != 4);
    }
    public static void main(String[] args)
    {
        System.out.println("-:*@*  Wel-Come to Address book systems  *@*:-");
        System.out.println("Create Contacts Details");
        AddressBookMain addressBookMainObject = new AddressBookMain();
        addressBookMainObject.switchOptions();
    }
}
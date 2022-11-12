// UC-6 Add multiple Address Book to the System. Each Address Book has a unique Name

package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain
{
    public void switchOptions()
    {
        AddressBook addressBookObject = new AddressBook();
        AddressBook book2 = new AddressBook();
        AddressBook book3 = new AddressBook();
        AddressBook book4 = new AddressBook();
        addressBookObject.addressBooks.put("AddressBook1",addressBookObject);
        addressBookObject.addressBooks.put("AddressBook2", book2);
        addressBookObject.addressBooks.put("AddressBook3", book3);
        addressBookObject.addressBooks.put("AddressBook4", book4);
        Scanner inputChoice = new Scanner(System.in);
        System.out.println("\n 1. Add \t 2. Edit \t 3. Delete \n 4. Print \t 5. Exit");
        System.out.print("Choose your options : ");
        int options = inputChoice.nextInt();
        do
        {
            switch (options)
            {
                case 1 :
                    System.out.println("Enter:\n1:Ramayana \t\t2:Mahabharath \n3:BhagawathGeetha \t4:Kaliyuga");
                    int chooseAddressBook=inputChoice.nextInt();
                    if(chooseAddressBook==1){addressBookObject.getContact();}
                    else if(chooseAddressBook==2){book2.getContact();}
                    else if(chooseAddressBook==3){book3.getContact();}
                    else if(chooseAddressBook==4){book4.getContact();}
                    else {
                        System.out.println("Option not found");
                    }
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
            options = inputChoice.nextInt();
        }while (options != 5);
    }
    public static void main(String[] args)
    {
        String address;
        System.out.println("-:*@*  Wel-Come to Address book systems  *@*:-");
        System.out.print("Enter Address Book Name : ");
        Scanner inputAddress = new Scanner(System.in);
        address = inputAddress.nextLine();
        System.out.println("Address Book Name : "+address);
        System.out.println("Create Contacts Details");
        AddressBookMain addressBookMainObject = new AddressBookMain();
        addressBookMainObject.switchOptions();
    }
}
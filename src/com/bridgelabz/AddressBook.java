// UC-3 Edit contacts Details in Address Book System

package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Platform.exit;

public class AddressBook
{
    List<Contact> contactList =new ArrayList<>();
    Scanner inputDetails = new Scanner(System.in);
    public void getContact()
    {
        System.out.println("Enter the details of contact person");
        System.out.print("Enter First name : ");
        String firstName=inputDetails.nextLine();
        System.out.print("Enter Last name : ");
        String lastName=inputDetails.nextLine();
        System.out.print("Enter Address : ");
        String address=inputDetails.nextLine();
        System.out.print("Enter City name : ");
        String city=inputDetails.nextLine();
        System.out.print("Enter State name : ");
        String state=inputDetails.nextLine();
        System.out.print("Enter zip-Code : ");
        String zipCode=inputDetails.nextLine();
        System.out.print("Enter Phone Number : ");
        String phoneNumber=inputDetails.nextLine();
        System.out.print("Enter Email ID : ");
        String email=inputDetails.nextLine();
        Contact contact =new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        contactList.add(contact);
        System.out.println("Person '"+firstName+"' details inserted in contact List");
    }
    public void editContact()
    {
        System.out.print("Enter contact's Person Name for edit : ");
        String searchName = inputDetails.next();
        for (Contact contact : contactList)
        {
            if (contact.getFirstName().equals(searchName))
            {
                System.out.print("Edit First Name : ");
                contact.setFirstName(inputDetails.next());
                System.out.print("Edit Last Name : ");
                contact.setLastName(inputDetails.next());
                System.out.print("Edit Address : ");
                contact.setAddress(inputDetails.next());
                System.out.print("Edit City Name : ");
                contact.setCity(inputDetails.next());
                System.out.print("Edit State Name : ");
                contact.setState(inputDetails.next());
                System.out.print("Edit Zip Code : ");
                contact.setZipCode(inputDetails.next());
                System.out.print("Edit Phone Number : ");
                contact.setPhoneNumber(inputDetails.next());
                System.out.print("Edit you Email ID : ");
                contact.setEmail(inputDetails.next());
                System.out.println("\nPerson '" + contact.getFirstName() + "' details Edited in the contact List\n");
            }
        }
    }
    @Override
    public String toString() {
        return "Contact List= " + contactList;
    }

    public void editPersonDetails() // Edit Person Contact Details
    {
        System.out.print("Enter contact's Person Name for edit : ");
        String searchName = inputDetails.next();
        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(searchName)) {
                System.out.println(" 1. firstName \t 2. lastName 3. address \n 4. city \t\t 5. state \t 6. phoneNumber \n 7. zipCode \t 8. email \t 9. Back");
                System.out.print("Choose your options for edit person details : ");
                int editOptions = inputDetails.nextInt();
                do {
                    switch (editOptions) {
                        case 1:
                            System.out.print("Edit First Name : ");
                            contact.setFirstName(inputDetails.next());
                            break;
                        case 2:
                            System.out.print("Edit Last Name : ");
                            contact.setLastName(inputDetails.next());
                            break;
                        case 3:
                            System.out.print("Edit Address : ");
                            contact.setAddress(inputDetails.next());
                            break;
                        case 4:
                            System.out.print("Edit City Name : ");
                            contact.setCity(inputDetails.next());
                            break;
                        case 5:
                            System.out.print("Edit State Name : ");
                            contact.setState(inputDetails.next());
                            break;
                        case 6:
                            System.out.print("Edit Phone Number : ");
                            contact.setPhoneNumber(inputDetails.next());
                            break;
                        case 7:
                            System.out.print("Edit Zip Code : ");
                            contact.setZipCode(inputDetails.next());
                            break;
                        case 8:
                            System.out.print("Edit you Email ID : ");
                            contact.setEmail(inputDetails.next());
                            break;
                        case 9:
                            System.out.println("Back to main menu option");
                            exit();
                            break;
                        default:
                            System.out.println("Invalid Key Options");
                            exit();
                            break;
                    }
                    System.out.println("\n 1. firstName \t 2. lastName 3. address \n 4. city \t\t 5. state \t 6. phoneNumber \n 7. zipCode \t 8. email \t 9. Back");
                    System.out.print("Edit Person details choose your options : ");
                    editOptions = inputDetails.nextInt();
                } while (editOptions != 9);
            }
        }
    }
}
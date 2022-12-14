// UC-7 Ensure there is no Duplicate Entry of the same Person in a particular Address Book

package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AddressBook
{
    List<Contact> contactList =new ArrayList<>();
    HashMap<String, AddressBook> addressBooks = new HashMap<>();
    Scanner inputDetails = new Scanner(System.in);
    //Adding Contacts using addContact method in the arraylist of address book and checking duplicates entry
    public boolean duplicateEntry(String firstname, Contact contact) {
        for (Contact contactObject : this.contactList)
            if (contactObject.getFirstName().equals(firstname))
                return true;
        return false;
    }
    public void getContact ()
    {
    System.out.print("Enter Number of times add contact details : ");
    int numberOfTimesAddContacts = inputDetails.nextInt();
    for(int i=0; i<numberOfTimesAddContacts;i++)
    {
            System.out.println("Enter the details of contact person");
            System.out.print("Enter First name : ");
            String firstName = inputDetails.nextLine();
            System.out.print("Enter Last name : ");
            String lastName = inputDetails.nextLine();
            System.out.print("Enter Address : ");
            String address = inputDetails.nextLine();
            System.out.print("Enter City name : ");
            String city = inputDetails.nextLine();
            System.out.print("Enter State name : ");
            String state = inputDetails.nextLine();
            System.out.print("Enter zip-Code : ");
            String zipCode = inputDetails.nextLine();
            System.out.print("Enter Phone Number : ");
            String phoneNumber = inputDetails.nextLine();
            System.out.print("Enter Email ID : ");
            String email = inputDetails.nextLine();
            Contact contact1 = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        boolean isDuplicate = duplicateEntry(contact1.getFirstName(), contact1);
        if (!isDuplicate)
        {
            contactList.add(contact1);
            System.out.println("Person '" + firstName + "' details inserted in contact List");
        }
        else
        {
            System.out.println("Person '" + firstName + "' Already exist in contact List");
        }
    }
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
            else
            {
                System.out.println("Contact not found with this name ");
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
                            break;
                        default:
                            System.out.println("Invalid Key Options");
                            break;
                    }
                    System.out.println("\n 1. firstName \t 2. lastName 3. address \n 4. city \t\t 5. state \t 6. phoneNumber \n 7. zipCode \t 8. email \t 9. Back");
                    System.out.print("Edit Person details choose your options : ");
                    editOptions = inputDetails.nextInt();
                } while (editOptions != 9);
            }
        }
    }
    public void deleteContact()
    {
        String checkFirstName=inputDetails.next();
        System.out.print("Enter contact's First Name you want to delete:");
        for (Contact contact:contactList)
        {
            if(contact.getFirstName().equals(checkFirstName))
            {
                contactList.remove(contact);
                System.out.println("\nPerson '" + contact.getFirstName() + "' Deleted in the contact List\n");
                break;
            }
            else
                System.out.println("Contact not found in a list");
        }
    }
}
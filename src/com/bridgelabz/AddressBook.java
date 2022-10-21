// UC-1 Create Contacts Details in Address Book

package com.bridgelabz;
public class AddressBook
{
    String firstName,lastName,address,city,state,phoneNumber,zipCode,email;
    public AddressBook(String firstName, String lastName, String address, String city, String state, String phoneNumber, String zipCode, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.email = email;
    }
    @Override
    public String toString() {
        return
                "firstName : " + firstName + '\n' +
                        "lastName : " + lastName + '\n' +
                        "address : " + address + '\n' +
                        "city : " + city + '\n' +
                        "state : " + state + '\n' +
                        "phoneNumber : " + phoneNumber + '\n' +
                        "zipCode : " + zipCode + '\n' +
                        "email : " + email + '\n' ;
    }
}
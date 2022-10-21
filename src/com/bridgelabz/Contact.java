// Add new contacts Details with override

package com.bridgelabz;

public class Contact
{
    private String firstName,lastName,address,city,state,phoneNumber,zipCode,email;
    public Contact(String firstName, String lastName, String address, String city, String state, String phoneNumber, String zipCode, String email)
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
                "First Name : " + firstName + '\n' +
                        "Last Name : " + lastName + '\n' +
                        "Address : " + address + '\n' +
                        "City Name : " + city + '\n' +
                        "State Name : " + state + '\n' +
                        "Phone Number : " + phoneNumber + '\n' +
                        "zip Code : " + zipCode + '\n' +
                        "Email ID : " + email + '\n' ;
    }
}
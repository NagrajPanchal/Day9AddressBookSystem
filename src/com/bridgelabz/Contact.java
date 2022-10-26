// UC-5 Add multiple Person To Address Book

package com.bridgelabz;

public class Contact
{
    private String firstName,lastName,address,city,state,phoneNumber,zipCode,email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
    public String toString()
    {
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
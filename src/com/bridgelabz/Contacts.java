package com.bridgelabz;

public class Contacts {
    private String firstName;
    private String lastName;
    private int age;
    private String state;
    private String city;
    private int phoneNo;
    private int pinCode;

    public Contacts(String firstName, String lastName, int age, String state, String city, int phoneNo, int pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
        this.city = city;
        this.phoneNo = phoneNo;
        this.pinCode = pinCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", phoneNo=" + phoneNo +
                ", pinCode=" + pinCode + "\n";
    }
}

package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Workshop AddressBook problem");

        AddressBook addressBook = new AddressBook();
        addressBook.addContacts("Company", new Contacts("Vikas", "Jadhav", 21, "Maha", "Pune", 65454651, 412203));
        addressBook.addContacts("Company", new Contacts("Vikas", "Jadhav", 21, "Maha", "Pune", 65454651, 412203));
        addressBook.addContacts("friend", new Contacts("Ajay", "Jadhav", 25, "Maha", "Pune", 65459651, 412203));
        addressBook.addContacts("family", new Contacts("Vishal", "Jadhav", 29, "Maha", "Pune", 65474651, 412203));
        addressBook.displayAddressBook();
    }
}

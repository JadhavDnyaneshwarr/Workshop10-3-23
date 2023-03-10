package com.bridgelabz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    public static Map<String, ArrayList<Contacts>> addressBook = new HashMap<>();

    public void addContacts(String addressBookName, Contacts contact){
        ArrayList<Contacts> addressBookDetails = addressBook.getOrDefault(addressBookName, new ArrayList<Contacts>());
        addressBookDetails.add(contact);
        addressBook.put( addressBookName, addressBookDetails);
    }

//    public Map<String, ArrayList<Contacts>> cityMap(){
//
//
//    }
//    public Map<String, ArrayList<Contacts>> stateMap(){
//
//    }
//
//    public void textFile(String fileName){
//        try{
//            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
//
//            for (Contacts contactDetails : addressBook.get()) {
//                writer.println(contactDetails.toString());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void displayAddressBook() {
        System.out.println(addressBook);
    }
}

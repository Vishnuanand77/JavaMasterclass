package com.vishnu.udemy.work.PhonebookManipulation;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    // Method to add contact object to the phonebook list
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }

    // Return the list of all available contacts
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }

    // Return the contact details of the given phone number
    public Contact viewContactGivenPhone(long phoneNumber){
        for (Contact contact: phoneBook
             ) {
            if(contact.getPhoneNumber() == phoneNumber) return contact;
        }
        return null;
    }

    // Remove the contact details of the given number. Return true if removed. If number is non existant return false
    public boolean removeContact(long phoneNumber){
        Contact contact = viewContactGivenPhone(phoneNumber);

        if(contact == null) return false;
        else return phoneBook.remove(contact);
    }
}

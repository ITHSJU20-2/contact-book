package se.iths.grupp2;

import se.iths.grupp2.contact.Contact;
import se.iths.grupp2.contact.ContactBook;

import java.util.Scanner;

public class Main {

    private static final ContactBook contactBook = new ContactBook();
    private static final Scanner scanner = new Scanner(System.in);

    public static ContactBook getContactBook() {
        return contactBook;
    }

    private static void addContact(){
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter contact private number: ");
        String privateNumber = scanner.nextLine();
        System.out.println("Enter contact address: ");
        String contactAddress = scanner.nextLine();
        System.out.println("Enter contact email: ");
        String contactEmail = scanner.nextLine();
        System.out.println("Enter contact work number: ");
        String workNumber = scanner.nextLine();
        System.out.println("Enter notes: ");
        String contactNote = scanner.nextLine();


        //create instance of Contact
        Contact newContact = new Contact(contactName, privateNumber, contactAddress, contactEmail, workNumber, contactNote);

        //check to see if added
        if (contactBook.addContact(newContact)){
            System.out.println("New contact added successfully.");
        }else{
            System.out.println("Contact creation failed.");
        }
    }

}
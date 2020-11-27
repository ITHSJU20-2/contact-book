package se.iths.grupp2;

import se.iths.grupp2.contact.Contact;
import se.iths.grupp2.contact.ContactBook;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    //Marcus branch tillagd

    private static final ContactBook contactBook = new ContactBook();

    public static ContactBook getContactBook() {
        return contactBook;
    }

    //Marcus sök kontakt
    private static void searchContact() {
        System.out.println("Please, enter the name of the contact.");
        String name = sc.nextLine();
        Contact existingContact = contactBook.contactName(name);
        if(existingContact == null) {
            System.out.println("Could not find the book.");
            return;
        }

        System.out.println("Found a contact! -> "+existingContact.getName());
    }

}

package se.iths.grupp2;

import se.iths.grupp2.contact.ContactBook;

public class Main {

    private static final ContactBook contactBook = new ContactBook();

    public static ContactBook getContactBook() {
        return contactBook;
    }

}

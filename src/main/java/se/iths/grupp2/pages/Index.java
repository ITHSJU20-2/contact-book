package se.iths.grupp2.pages;

import se.iths.grupp2.contact.Contact;
import se.iths.grupp2.contact.ContactBook;
import se.iths.grupp2.Main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.IOException;

@Path("hello")
public class Index {

    @GET
    public String display() throws IOException {
        ContactBook contactBook = Main.getContactBook();
        contactBook.addContact(new Contact("Test", "123456789", "Place I live, 413578",
                "me@myself&I.com", "123456789","I know what you did last summer."));

        StringBuilder format = new StringBuilder();
        for (Contact contact : contactBook.getContactList()) {
            format.append(contact.getName()).append("\n").append(contact.getPhoneNumber()).append("\n")
                    .append(contact.getAddress()).append("\n").append(contact.getEmail()).append("\n")
                    .append(contact.getWork()).append("\n").append(contact.getNotes()).append("\n\n");
        }

        return format.toString();
    }
}

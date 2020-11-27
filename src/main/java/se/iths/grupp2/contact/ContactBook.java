package se.iths.grupp2.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

    private final List<Contact> contactList;

    public ContactBook() {
        contactList = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        return contactList.add(contact);
    }

    public boolean removeContact(Contact contact) {
        return contactList.remove(contact);
    }

    public Contact findContact(QueryType queryType, String query) {
        for (Contact contact : contactList) {
            switch (queryType) {
                case ADDRESS:
                    if (query.equalsIgnoreCase(contact.getAddress())) {
                        return contact;
                    }
                    break;
                case NAME:
                    if (query.equalsIgnoreCase(contact.getName())) {
                        return contact;
                    }
                    break;
                case EMAIL:
                    if (query.equalsIgnoreCase(contact.getEmail())) {
                        return contact;
                    }
                    break;
                case WORK:
                    if (query.equalsIgnoreCase(contact.getWork())) {
                        return contact;
                    }
                    break;
                case PHONENUMBER:
                    if (query.equalsIgnoreCase(contact.getPhoneNumber())) {
                        return contact;
                    }
                    break;
                default:
                    return null;
            }
        }
        return null;
    }

    public List<Contact> getFavorites() {
        List<Contact> list = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.isFavorite()) {
                list.add(contact);
            }
        }
        return list;
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}


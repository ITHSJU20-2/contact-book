package se.iths.grupp2;

public class Main {

    private static ContactBook contactBook;

    public static void main(String[] args) {
        contactBook = new ContactBook();
        Contact contact = new Contact("Test User", "0763922179");
        Contact contact2 = new Contact("Test User 2", "1234567890+");
        contact2.setFavorite(true);
        contactBook.addContact(contact);
        contactBook.addContact(contact2);
        System.out.println(format());
    }

    private static String format() {
        StringBuilder temp = new StringBuilder("---\n");
        for (Contact contact : contactBook.getContactList()) {
            temp.append("Name: ").append(contact.getName()).append("\nPhone Number: ").append(contact.getPhoneNumber()).append("\nFavorite: ").append(contact.isFavorite()).append("\n---\n");
        }
        return temp.toString();
    }

}

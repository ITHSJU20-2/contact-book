package se.iths.grupp2.contact;

import java.util.List;

public class Contact {

    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String workPhone;
    private String notes;
    //private boolean favorite;
    //Is this not to be added separately?

    public Contact(String name, String phoneNumber, String address, String email, String workPhone, String notes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.workPhone = workPhone;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork() {
        return workPhone;
    }

    public void setWork(String work) {
        this.workPhone = work;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean addNote(String note) {
        return notes.add(note);
    }

    public boolean removeNote(String note) {
        return notes.remove(note);
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

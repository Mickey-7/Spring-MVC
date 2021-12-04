package com.example.boottomvctilesajax.model;

public class Contact {
    private int contactId;
    private String contactName;
    private String contactAddress;
    private String contactPhone;

    public Contact() {
    }

    public Contact(int contactId, String contactName, String contactAddress, String contactPhone) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactAddress = contactAddress;
        this.contactPhone = contactPhone;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", contactName='" + contactName + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}

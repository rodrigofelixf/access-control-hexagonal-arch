package io.github.felixdev.acesso_api.core.domain;

public class Resident {
    private Long id;
    private String document;
    private String address;
    private String phoneNumber;
    private Person person;


    public Resident() {
    }

    public Resident(Long id, String document, String address, String phoneNumber, Person person) {
        this.id = id;
        this.document = document;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

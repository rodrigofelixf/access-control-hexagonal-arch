package io.github.felixdev.acesso_api.core.domain;

public class Resident {
    private Long id;
    private String document;
    private String address;
    private String phonoNumber;
    private Long idPerson;

    public Resident() {
    }

    public Resident(Long id, String document, String address, String phonoNumber, Long idPerson) {
        this.id = id;
        this.document = document;
        this.address = address;
        this.phonoNumber = phonoNumber;
        this.idPerson = idPerson;
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

    public String getPhonoNumber() {
        return phonoNumber;
    }

    public void setPhonoNumber(String phonoNumber) {
        this.phonoNumber = phonoNumber;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }
}

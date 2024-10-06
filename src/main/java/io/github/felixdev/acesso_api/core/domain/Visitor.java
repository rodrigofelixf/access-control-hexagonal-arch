package io.github.felixdev.acesso_api.core.domain;

public class Visitor {
    private Long id;
    private String documentId;
    private Long idPerson;


    public Visitor() {
    }

    public Visitor(Long id, String documentId, Long idPerson) {
        this.id = id;
        this.documentId = documentId;
        this.idPerson = idPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }
}

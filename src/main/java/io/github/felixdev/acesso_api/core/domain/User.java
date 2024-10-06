package io.github.felixdev.acesso_api.core.domain;

public class User {
    private Long id;
    private String email;
    private String password;
    private Boolean isUserAdmin;
    private Long idPerson;

    public User() {
    }

    public User(Long id, String email, String password, Boolean isUserAdmin, Long idPerson) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.isUserAdmin = isUserAdmin;
        this.idPerson = idPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Boolean getUserAdmin() {
        return isUserAdmin;
    }

    public void setUserAdmin(Boolean userAdmin) {
        isUserAdmin = userAdmin;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }
}

package com.company.classes.models;

public class Client {
    private Integer id;
    private String name;
    private String surname;
    private Integer pesel;

    public Client() {
    }

    public Client(Integer id, String name, String surname, Integer pesel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
}

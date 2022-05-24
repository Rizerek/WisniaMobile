package com.company.classes.models;

import com.company.Main;

public class Client {
    private Integer id;
    private String name;
    private String surname;
    private Integer phone;
    private Integer pesel;

    public Client() {
    }

    public Client(Integer id, String name, String surname,Integer phone, Integer pesel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }
}

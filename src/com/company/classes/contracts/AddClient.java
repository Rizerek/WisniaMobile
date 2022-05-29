package com.company.classes.contracts;
import com.company.Main;
import com.company.classes.models.Client;

import java.util.List;

public class AddClient extends Main {
    private Integer id;
    private String name;
    private String surname;
    private Integer phone;
    private Integer pesel;
    private List<AddClient> addClients;

    public AddClient() {

    }

    public AddClient(Integer id, String name, String surname,Integer phone, Integer pesel,List<AddClient> addClients) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.pesel = pesel;
        this.addClients = addClients;
    }

    //dodanie klienta
    public void Add()
    {
        AddClientt(id, name,surname,phone,pesel);
    }



    public List<AddClient> getAddedClients() {
        return addClients;
    }

    public void setAddClients(List<AddClient> addClients) {
        this.addClients = addClients;
    }
}

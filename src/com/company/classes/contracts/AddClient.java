package com.company.classes.contracts;
import java.util.List;

public class AddClient {
    private Integer id;
    private String name;
    private String surname;

    private List<AddClient> addClients;

    public AddClient() {
    }

    public AddClient(Integer id, String name, String surname, List<AddClient> addClients) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.addClients = addClients;
    }
}

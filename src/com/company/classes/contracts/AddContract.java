package com.company.classes.contracts;

import com.company.classes.models.Client;

import java.util.List;

public class AddContract
{
    private Integer id;
    private Client client;
    private List<AddContract> addContracts;

    public AddContract() {
    }

    public AddContract(Integer id, Client client, List<AddContract> addContracts) {
        this.id = id;
        this.client = client;
        this.addContracts = addContracts;
    }
}

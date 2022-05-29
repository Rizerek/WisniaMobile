package com.company.classes.contracts;

import com.company.classes.models.Client;
import com.company.Main;

import java.util.List;

public class AddContract extends Main
{
    private Integer id;
    private Client client;
    private Contract contract;

    public AddContract() {
    }

    public AddContract(Integer id, Client client, Contract contract) {
        this.id = id;
        this.client = client;
        this.contract = contract;
    }
    //dodanie kontraktu
    public void Add()
    {
        AddContractt(id, client,contract.getTariff(),contract.getEndDate(),contract.getRegulationDay());
    }
}

package com.company.classes.contracts;

import com.company.Main;
import com.company.classes.models.Client;

public class DropContract extends Main {
    private Contract contract;
    public void DeleteClient()
    {
        DeleteContractt(contract.getId());
    }
}

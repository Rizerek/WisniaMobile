package com.company.classes.contracts;

import com.company.Main;
import com.company.classes.models.Client;

public class DeleteClient extends Main {
    private Client client;
    public void DeleteClient()
    {
        DeleteClientt(client.getId());
    }

}

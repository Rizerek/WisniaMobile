package com.company.classes.contracts;

import com.company.classes.models.Client;
import com.company.classes.models.Tariff;


import java.time.MonthDay;
import java.util.Date;

public class Contract {
    private Integer id;
    private Client client;
    private Tariff tariff;
    private Date endDate;
    private MonthDay regulationDay;

    public Contract() {
    }

    public Contract(Integer id, Client client, Tariff tariff, Date endDate, MonthDay regulationDay) {
        this.id = id;
        this.client = client;
        this.tariff = tariff;
        this.endDate = endDate;
        this.regulationDay = regulationDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public MonthDay getRegulationDay() {
        return regulationDay;
    }

    public void setRegulationDay(MonthDay regulationDay) {
        this.regulationDay = regulationDay;
    }
}

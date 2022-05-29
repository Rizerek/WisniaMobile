package com.company.classes.models;

import com.company.enums.contractType;
import com.company.enums.smsPhone;

public class Tariff {
    private Integer id;
    private Double price;
    private contractType contractType;
    private Integer duration;
    private smsPhone smsPhone;


    public Tariff() {
    }

    public Tariff(Integer id,Double price, com.company.enums.contractType contractType, Integer duration, com.company.enums.smsPhone smsPhone) {
        this.id =id;
        this.price = price;
        this.contractType = contractType;
        this.duration = duration;
        this.smsPhone = smsPhone;
    }
    public Integer getId()
    {
        return id;
    }
    public Double getPrice()
    {
        return price;
    }

}

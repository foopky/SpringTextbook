package com.example.ch13.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Account {
    private long id;
    private String name;

    private BigDecimal amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

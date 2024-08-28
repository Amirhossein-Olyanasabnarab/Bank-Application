package com.bank.model;

import com.bank.enums.CostumerType;

public class RealCostumer extends Costumer{
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public RealCostumer(String name, String phoneNumber) {
        super(name, phoneNumber, CostumerType.REAL);
    }
}

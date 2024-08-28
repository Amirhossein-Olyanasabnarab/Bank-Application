package com.bank.model;

import com.bank.enums.CostumerType;

public class LegalCostumer extends Costumer{
    private String fax;
    public LegalCostumer(String name, String phoneNumber) {
        super(name, phoneNumber, CostumerType.LEGAL);
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}

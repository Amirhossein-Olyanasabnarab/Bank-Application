package com.bank.view.component;

import com.bank.model.Customer;
import com.bank.model.LegalCustomer;

import java.util.Scanner;

public class LegalCustomerUI extends AbstractCustomerUI{
    public LegalCustomerUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public Customer generateCustomer() {
        String name = getMessage("Enter your customer name: ");
        String phone = getMessage("Enter your customer phone number: ");
        String fax = getMessage("Enter your customer fax: ");
        LegalCustomer legalCustomer = new LegalCustomer(name, phone);
        legalCustomer.setFax(fax);
        return legalCustomer;
    }

    @Override
    public void editCustomer(Customer customer) {

    }
}

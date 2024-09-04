package com.bank.view.component;

import com.bank.model.Customer;
import com.bank.model.RealCustomer;

import java.util.Scanner;

public class RealCustomerUI extends AbstractCustomerUI{

    public RealCustomerUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public Customer generateCustomer() {
        String name = getMessage("Enter customer name:");
        String family = getMessage("Enter customer family:");
        String phone = getMessage("Enter customer phone number:");
        RealCustomer realCustomer = new RealCustomer(name, phone);
        realCustomer.setFamily(family);
        return realCustomer;
    }

    @Override
    public void editCustomer(Customer customer) {

    }
}

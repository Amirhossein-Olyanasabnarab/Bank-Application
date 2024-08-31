package com.bank.service;

import com.bank.model.Customer;
import com.bank.model.LegalCustomer;
import com.bank.model.RealCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerService {

    private ArrayList<Customer> customers = new ArrayList<>();


    public void searchAndDeleteCustomerByName(String name) {
        customers.removeIf(customer -> customer.getName().equalsIgnoreCase(name));
    }


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public List<Customer> searchCustomerByName(String name) {
        return customers.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Customer> searchCustomersByFamily(String family) {
        return customers.stream()
                .filter(customer -> customer instanceof RealCustomer)
                .map(customer -> (RealCustomer) customer)
                .filter(RealCustomer -> RealCustomer.getFamily().equalsIgnoreCase(family))
                .collect(Collectors.toList());
    }
}

package com.bank.service;

import com.bank.model.Customer;
import com.bank.model.RealCustomer;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class CustomerService {
    private static final CustomerService INSTANCE;
    public static CustomerService getInstance() {
        return INSTANCE;
    }
    static {
        INSTANCE = new CustomerService();
    }
    private ArrayList<Customer> customers = new ArrayList<>();

    private CustomerService() {
    }

    public void deleteCustomerById(Integer id) {
          customers.stream()
                  .filter(customer -> customer.getId().equals(id))
                  .forEach(customer -> customer.setDeleted(true));
    }


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getActiveCustomers() {
        return customers.stream()
                .filter(customer -> !customer.getDeleted())
                .collect(Collectors.toList());
    }

    public List<Customer> searchCustomerByName(String name) {
        return customers.stream()
                .filter(customer -> !customer.getDeleted())
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Customer> searchCustomersByFamily(String family) {
        return customers.stream()
                .filter(customer -> !customer.getDeleted())
                .filter(customer -> customer instanceof RealCustomer)
                .map(customer -> (RealCustomer) customer)
                .filter(RealCustomer -> RealCustomer.getFamily().equalsIgnoreCase(family))
                .collect(Collectors.toList());
    }

    public List<Customer> getDeletedCustomers() {
        return customers.stream()
                .filter(customer -> customer.getDeleted())
                .collect(Collectors.toList());
    }

    public Customer getCustomerById(Integer id) {
        return customers.stream()
                .filter(customer -> !customer.getDeleted())
                .filter(customer -> customer.getId().equals(id))
                .findFirst().get();
    }
}

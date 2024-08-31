package com.bank;

import com.bank.service.CustomerService;

public class ApplicationRunner {
    public static void main(String[] args) {
       try(CustomerService customerService = new CustomerService()) {
           customerService.run();
       }
    }
}

package com.bank;

import com.bank.service.Bank;

public class ApplicationRunner {
    public static void main(String[] args) {
       try(Bank bank = new Bank()) {
           bank.run();
       }
    }
}

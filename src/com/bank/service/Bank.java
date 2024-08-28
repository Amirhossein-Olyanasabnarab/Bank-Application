package com.bank.service;

import com.bank.model.Customer;
import com.bank.model.LegalCustomer;
import com.bank.model.RealCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements AutoCloseable{

    private ArrayList<Customer> customers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            printMenu();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exit . . .");
                    break;
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    printCustomer();
                    break;
                case 3:
                    searchAndPrintCustomers();
                    break;
                case 4:
                    System.out.println("Search and print customers by family");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    private void printMenu() {
        System.out.println("0 - Exit");
        System.out.println("1 - Add new customer");
        System.out.println("2 - Print all customer");
        System.out.println("3 - Search and print customer by name");
        System.out.println("4 - Search and print customer by family");
    }

    private void addNewCustomer() {
        System.out.println("***********************");
        System.out.println("1 - Real Customer");
        System.out.println("2 - Legal Customer");
        System.out.println("Please choose a customer type:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter customer name:");
            String name = scanner.nextLine();
            System.out.println("Enter customer family:");
            String family = scanner.nextLine();
            System.out.println("Enter customer phone number:");
            String phone = scanner.nextLine();
            RealCustomer realCustomer = new RealCustomer(name, phone);
            realCustomer.setFamily(family);
            customers.add(realCustomer);
        } else if (choice == 2) {
            System.out.println("Enter customer name:");
            String name = scanner.nextLine();
            System.out.println("Enter customer phone number:");
            String phone = scanner.nextLine();
            System.out.println("Enter customer fax:");
            String fax = scanner.nextLine();
            LegalCustomer legalCustomer = new LegalCustomer(name, phone);
            legalCustomer.setFax(fax);
            customers.add(legalCustomer);
        } else {
            System.out.println("Invalid choice . . . ");
        }
    }

    private void printCustomer() {
        if (customers.isEmpty()) {
            System.out.println("No customer found");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private void searchAndPrintCustomers() {
        System.out.println("Please enter name for searching by customer name");
        String name = scanner.nextLine();
        if(customers.isEmpty()){
            System.out.println("No customer found");
        }else {
            for (Customer customer : customers) {
                if(customer.getName().equalsIgnoreCase(name)){
                    System.out.println(customer);
                }
            }
        }
    }
    @Override
    public void close()  {
        scanner.close();
    }
}

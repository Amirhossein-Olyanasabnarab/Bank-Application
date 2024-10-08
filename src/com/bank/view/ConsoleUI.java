package com.bank.view;

import com.bank.model.Customer;
import com.bank.model.LegalCustomer;
import com.bank.model.RealCustomer;
import com.bank.service.CustomerService;
import com.bank.view.component.AbstractCustomerUI;
import com.bank.view.component.LegalCustomerUI;
import com.bank.view.component.RealCustomerUI;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements AutoCloseable {
    private final Scanner scanner ;
    private final CustomerService customerService ;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        customerService = CustomerService.getInstance();
    }

    public void startMenu() {
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
                    addCustomer();
                    break;
                case 2:
                    printAllCustomers();
                    break;
                case 3:
                    searchAndPrintCustomersByName();
                    break;
                case 4:
                    editCustomerById();
                    break;
                case 5:
                    searchAndEditCustomerByName();
                    break;
                case 6:
                    DeleteCustomerById();
                    break;
                case 7:
                    printAllDeleteCustomers();
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    private void printAllDeleteCustomers() {
        List<Customer> customers = customerService.getDeletedCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers deleted");
        }else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private void printMenu() {
        System.out.println("0 - Exit");
        System.out.println("1 - Add new customer");
        System.out.println("2 - Print all customers");
        System.out.println("3 - Search and print customers by name");
        System.out.println("4 - Edit customers by id");
        System.out.println("5 - Search and edit customer by name");
        System.out.println("6 - Delete customer by id");
        System.out.println("7 - Print all deleted customers");
    }

    private void addCustomer() {
        System.out.println("***********************");
        System.out.println("1 - Real Customer");
        System.out.println("2 - Legal Customer");
        System.out.println("Please choose a customer type:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        AbstractCustomerUI customerUI = null ;
        if (choice == 1) {
            customerUI = new RealCustomerUI(scanner);
        } else if (choice == 2) {
           customerUI = new LegalCustomerUI(scanner);
        } else {
            System.out.println("Invalid choice . . . ");
        }
        Customer customer = customerUI.generateCustomer();
        customerService.addCustomer(customer);
    }

    private void printAllCustomers() {
        List<Customer> allCustomers = customerService.getActiveCustomers();
        if (allCustomers.isEmpty()) {
            System.out.println("No customer found");
        } else {
            for (Customer customer : allCustomers) {
                System.out.println(customer);
            }
        }
    }

    private void searchAndPrintCustomersByName() {

        System.out.println("Please enter name for searching by customer name");
        String name = scanner.nextLine();
        List<Customer> customers = customerService.searchCustomerByName(name);
        customers.forEach(System.out::println);
    }

    private void editCustomerById() {
        System.out.println("Please enter id for editing by customer id");
        String id = scanner.nextLine();
        Customer customer = customerService.getCustomerById(Integer.valueOf(id));
        System.out.println(customer);

        AbstractCustomerUI customerUI = null ;

        if(customer instanceof RealCustomer realCustomer){
            customerUI = new RealCustomerUI(scanner);
        } else if(customer instanceof LegalCustomer legalCustomer) {
           customerUI = new LegalCustomerUI(scanner);
        }
        customerUI.editCustomer(customer);
    }

    private void searchAndEditCustomerByName() {
        System.out.println("Enter your customer name:");
        String name = scanner.nextLine();
        List<Customer> customers = customerService.searchCustomerByName(name);
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println("Enter your new customer name:");
            String newName = scanner.nextLine();
            System.out.println("Enter your new customer phone number:");
            String phone = scanner.nextLine();
            customer.setName(newName);
            customer.setPhoneNumber(phone);
            if (customer instanceof RealCustomer realCustomer) {
                System.out.println("Enter your new customer family:");
                String family = scanner.nextLine();
                realCustomer.setFamily(family);
            } else if (customer instanceof LegalCustomer legalCustomer) {
                System.out.println("Enter your new customer fax:");
                String fax = scanner.nextLine();
                legalCustomer.setFax(fax);
            }
        }
    }

    private void DeleteCustomerById() {
        System.out.println("Enter your customer id:");
        String id = scanner.nextLine();
        customerService.deleteCustomerById(Integer.valueOf(id));
    }


    @Override
    public void close() {
        scanner.close();
    }
}

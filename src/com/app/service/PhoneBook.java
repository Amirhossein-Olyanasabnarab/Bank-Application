package com.app.service;

import com.app.model.BusinessContact;
import com.app.model.Contact;
import com.app.model.PersonalContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();
    public void runner() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            printMenu();
            System.out.println("Please choose one of the following options:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exit . . . ! ! !");
                    break;
                case 1:
                    addNewContact(scanner);
                    break;
                case 2:
                    System.out.println("Show all phonebooks \n");
                    break;
                default:
                    System.out.println("Invalid choice \n");
                    break;
            }
        }while (choice != 0);
    scanner.close();
    }

    private void addNewContact(Scanner scanner) {
        System.out.println("Please choose one kind of contact:");
        System.out.println("1- Personal Contact");
        System.out.println("2- Business Contact");
        int choice = scanner.nextInt();
        scanner.nextLine();
       if (choice == 1) {
           System.out.println("Enter contact name: ");
           String name = scanner.nextLine();
           System.out.println("Enter contact family: ");
           String family = scanner.nextLine();
           System.out.println("Enter contact phone number: ");
           String phoneNumber = scanner.nextLine();
           PersonalContact personalContact = new PersonalContact(name, phoneNumber);
           personalContact.setFamily(family);
            contacts.add(personalContact);
           System.out.println("Contact added successfully");
       }else if (choice == 2) {
           System.out.println("Enter contact name: ");
           String name = scanner.nextLine();
           System.out.println("Enter contact phone number:");
           String phoneNumber = scanner.nextLine();
           System.out.println("Enter contact email: ");
           String email = scanner.nextLine();
           BusinessContact businessContact = new BusinessContact(name, phoneNumber);
           businessContact.setEmail(email);
           contacts.add(businessContact);
           System.out.println("Contact added successfully");
       }
    }

    private void printMenu(){
        System.out.println("0 - Exit");
        System.out.println("1 - Add new phonebook");
        System.out.println("2 - Show all phonebooks \n");
    }
}

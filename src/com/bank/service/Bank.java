package com.bank.service;

import com.bank.model.Costumer;
import com.bank.model.LegalCostumer;
import com.bank.model.RealCostumer;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Costumer> costumers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        int choice;
        do {
            printMenu();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 :
                    System.out.println("Exit . . .");
                    break;
                case 1:
                    addNewCostumer();
                    break;
                case 2:
                    printCostumers();
                    break;
                case 3:
                    System.out.println("Search and print costumers by name");
                    break;
                case 4:
                    System.out.println("Search and print costumers by family");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
        scanner.close();
    }

    public void printMenu(){
        System.out.println("0 - Exit");
        System.out.println("1 - Add new costumer");
        System.out.println("2 - Print all costumers");
        System.out.println("3 - Search and print costumer by name");
        System.out.println("4 - Search and print costumer by family");
    }

    private void addNewCostumer(){
        System.out.println("***********************");
        System.out.println("1 - Real Costumer");
        System.out.println("2 - Legal Costumer");
        System.out.println("Please choose a costumer type:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter costumer name:");
            String name = scanner.nextLine();
            System.out.println("Enter costumer family:");
            String family = scanner.nextLine();
            System.out.println("Enter costumer phone number:");
            String phone = scanner.nextLine();
            RealCostumer realCostumer = new RealCostumer(name, phone);
            realCostumer.setFamily(family);
            costumers.add(realCostumer);
        }else if (choice == 2){
            System.out.println("Enter costumer name:");
            String name = scanner.nextLine();
            System.out.println("Enter costumer phone number:");
            String phone = scanner.nextLine();
            System.out.println("Enter costumer fax:");
            String fax = scanner.nextLine();
            LegalCostumer legalCostumer = new LegalCostumer(name, phone);
            legalCostumer.setFax(fax);
            costumers.add(legalCostumer);
        }else {
            System.out.println("Invalid choice . . . ");
        }
    }

    private void printCostumers(){
        if (costumers.isEmpty()) {
            System.out.println("No costumers found");
        }else {
            for (Costumer costumer : costumers) {
                System.out.println(costumer);
            }
        }
    }
}

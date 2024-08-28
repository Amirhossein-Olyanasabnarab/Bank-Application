package com.bank.service;

import java.util.Scanner;

public class Bank {
private Scanner scanner = new Scanner(System.in);
    public void run(){
        printMenu();
        int choice;
        do {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 :
                    System.out.println("Exit . . .");
                    break;
                case 1:
                    System.out.println("Add");
                    break;
                case 2:
                    System.out.println("Print all costumers");
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
    }

    public void printMenu(){
        System.out.println("0 - Exit");
        System.out.println("1 - Add new costumer");
        System.out.println("2 - Print all costumers");
        System.out.println("3 - Search and print costumer by name");
        System.out.println("4 - Search and print costumer by family");
    }
}

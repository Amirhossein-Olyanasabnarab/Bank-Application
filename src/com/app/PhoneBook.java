package com.app;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            System.out.println("Please choose one of the following options:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exit ... !!!");
                    break;
                case 1:
                    System.out.println("Add new phonebook \n");
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

    private static void printMenu(){
        System.out.println("0 - Exit");
        System.out.println("1 - Add new phonebook");
        System.out.println("2 - Show all phonebooks \n");
    }
}

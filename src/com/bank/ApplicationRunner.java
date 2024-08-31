package com.bank;

import com.bank.view.ConsoleUI;

public class ApplicationRunner {
    public static void main(String[] args) {
       try(ConsoleUI consoleUI = new ConsoleUI()) {
           consoleUI.startMenu();
       }
    }
}

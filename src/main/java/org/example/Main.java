package org.example;

import java.util.Scanner;

import static org.example.Helper.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        displayWelcomeScreen();
        for (int i = 0; i < 10; i++) {
            company.employees.add(createNewEmployee());
        }
        while (true) {
            displayMenu();
            int menu;
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> Helper.getSumOfSalaries(company.employees);
                case 2 -> Helper.getEmployeeData(company.employees);
                case 3 -> company.employees.add(createNewEmployee());
                case 4 -> {
                    printMessage("Program will ends.");
                    System.exit(0);
                }
                default -> printMessage("Pick a number from menu");
            }
        }
    }
}
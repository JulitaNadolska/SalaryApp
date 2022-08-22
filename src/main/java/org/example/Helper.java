package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Scanner;

public class Helper {
    public static Employee createNewEmployee() {
        printMessage("Provide first name: ");

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        printMessage("Provide last name: ");

        String lastName = scanner.nextLine();

        printMessage("Provide salary: ");

        int salary = scanner.nextInt();
        scanner.nextLine();

        return new Employee(firstName, lastName, salary);
    }

    public static void displayMenu() {
        printMessage("1 – Print sum of all employees salary");
        printMessage("2 – Display all employees data");
        printMessage("3 – Add new employee");
        printMessage("4 – End program");
    }

    static void getEmployeeData(@NotNull List<Employee> employees) {
        for (Employee employee : employees) {
            printMessage(employee.getFirstName() + " " + employee.getLastName() + ", " + employee.getSalary());
        }
    }

    static void getSumOfSalaries(@NotNull List<Employee> employees) {
        int sumOfSalaries = 0;
        for (Employee newEmployees : employees) {
            sumOfSalaries += newEmployees.getSalary();
        }
        printMessage("The sum of salaries of all employees is: " + sumOfSalaries);
    }

    static void displayWelcomeScreen() {
        printMessage("Welcome to the application to manage employees in the company.");
        printMessage("You will be asked to add 10 employees (first name, last name and payout amount). Then a menu will appear where you can choose what to do next.");
    }

    static void printMessage(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.app;


import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
        PensionCLIApp app = new PensionCLIApp();
        try {
            // Sample Data
            app.addEmployee(new Employee(1, "Daniel", "Agar", LocalDate.of(2018, Month.JANUARY, 17), 105945.50));
            app.addEmployee(new Employee(2, "Bernard", "Shaw", LocalDate.of(2017, Month.OCTOBER, 20), 90750.00));

            // Employee with a pension plan
            Employee empWithPlan = new Employee(3, "John", "Doe", LocalDate.of(2015, Month.FEBRUARY, 15), 95000.00);
            empWithPlan.setPensionPlan(new PensionPlan("PN1234", LocalDate.of(2023, Month.JANUARY, 17), 500.00));
            app.addEmployee(empWithPlan);

            // Print All Employees
            System.out.println("All Employees:");

            app.printAllEmployees();

            // Print Monthly Upcoming Enrollees
            System.out.println("\nMonthly Upcoming Enrollees:");
            app.printMonthlyUpcomingEnrollees();
        } catch (Exception e) {
            System.out.println("HELLO EXCEPTION");
        }

    }
}

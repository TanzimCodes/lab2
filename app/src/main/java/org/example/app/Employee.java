package org.example.app;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    private PensionPlan pensionPlan;

    // Constructor
    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    // Getters and Setters
    public long getEmployeeId() { return employeeId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getEmploymentDate() { return employmentDate; }
    public double getYearlySalary() { return yearlySalary; }
    public PensionPlan getPensionPlan() { return pensionPlan; }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }
}

package org.example.app;

import java.time.LocalDate;

public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;

    // Constructor
    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    // Getters
    public String getPlanReferenceNumber() { return planReferenceNumber; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public double getMonthlyContribution() { return monthlyContribution; }
}
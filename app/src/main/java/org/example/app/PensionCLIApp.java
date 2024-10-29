package org.example.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class PensionCLIApp {
    private List<Employee> employees;
    private ObjectMapper objectMapper;

    public PensionCLIApp() {
        employees = new ArrayList<>();
        objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Feature 1: Print All Employees in JSON
    public void printAllEmployees() throws Exception {
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparing(Employee::getLastName)
                .thenComparing(Comparator.comparingDouble(Employee::getYearlySalary).reversed()))
            .collect(Collectors.toList());

        System.out.println(objectMapper.writeValueAsString(sortedEmployees));
    }

    // Feature 2: Print Monthly Upcoming Enrollees Report
    public void printMonthlyUpcomingEnrollees() throws Exception {
        LocalDate firstDayNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate lastDayNextMonth = firstDayNextMonth.withDayOfMonth(firstDayNextMonth.lengthOfMonth());

        List<Employee> upcomingEnrollees = employees.stream()
            .filter(emp -> emp.getPensionPlan() == null &&
                emp.getEmploymentDate().plusYears(5).compareTo(firstDayNextMonth) >= 0 &&
                emp.getEmploymentDate().plusYears(5).compareTo(lastDayNextMonth) <= 0)
            .sorted(Comparator.comparing(Employee::getEmploymentDate))
            .collect(Collectors.toList());

        System.out.println(objectMapper.writeValueAsString(upcomingEnrollees));
    }
}
package week1;

import java.util.Map;
import java.util.TreeMap;

public class EmploymentManageSystem {
    // Using TreeMap to store employees sorted by name
    private Map<String, Employee> employees;

    public EmploymentManageSystem() {
        employees = new TreeMap<>();
    }

    // Add an employee (will be sorted automatically by name)
    public void addEmployee(String name, int age) {
        employees.put(name, new Employee(name, age));
    }

    // Delete an employee by name
    public void deleteEmployee(String name) {
        employees.remove(name);
    }

    // Print all employees (they will be printed in alphabetical order)
    public void printEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}

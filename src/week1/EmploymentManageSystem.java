package week1;

import java.util.ArrayList;
import java.util.List;

public class EmploymentManageSystem {
    // Using ArrayList to store employees
    private List<Employee> employees;

    public EmploymentManageSystem() {
        employees = new ArrayList<>();
    }

    // Add an employee (if the same name and age exist, it will not be added)
    public void addEmployee(String name, int age) {
        Employee newEmployee = new Employee(name, age);
        if (employees.isEmpty()) {
            employees.add(newEmployee);
            return;
        }

        int idx = 0;

        for (Employee employee : employees) {
            if (employee.getName().equals(name) && employee.getAge() == age) {
                System.out.println("Warning: Employee with the same name and age already exists.");
                return;
            }

            if (name.compareTo(employee.getName()) < 0 ||
                    (name.equals(employee.getName()) && age < employee.getAge())) {
                employees.add(idx, newEmployee);
                return;
            }

            idx++;
        }

        employees.add(newEmployee);
    }


    // Delete an employee by name
    public void deleteEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    // Print all employees
    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

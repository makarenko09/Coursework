package com.skypro.employeeBook;

import com.skypro.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private List<Employee> employees;

    public EmployeeBook() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String fullName, int department, double salary) {
        Employee newEmployee = new Employee(fullName, department, salary);
        employees.add(newEmployee);
        System.out.println("Сотрудник добавлен: " + newEmployee);
    }

    //    // Метод для получения списка сотрудников
//    public Employee[] getEmployees() {
//        return employees.clone(); // Возвращаем копию массива для защиты от внешних изменений
//    }
//    // Second complexity
////     Метод для поиска сотрудника с максимальной зарплатой
//    public void findEmployeeWithMoreUpSalary(Employee[] employees, double someSalary) {
//        System.out.println("Main.findEmployeeWithMoreUpSalary");
//        System.out.println("Employees with salary greater than " + someSalary + ":");
//        for (Employee employee : employees) {
//            if (employee.getSalary() > someSalary) {
//                System.out.println("ID: " + employee.getId() + ", Full Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
//            }
//        }
//    }
//
//    public static void findEmployeeWithMoreDownSalary(Employee[] employees, double someSalary) {
//        System.out.println("Main.findEmployeeWithMoreDownSalary");
//        System.out.println("Employees with salary less than " + someSalary + ":");
//        for (Employee employee : employees) {
//            if (employee.getSalary() <= someSalary) {
//                System.out.println("ID: " + employee.getId() + ", Full Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
//            }
//        }
//    }
    public void printAllEmployees(Integer... department) {
        int targetDepartment = department.length == 0 ? -1 : department[0];
        String header = targetDepartment == -1 ? "Список всех сотрудников:" : "Список сотрудников отдела " + targetDepartment + ":";
        System.out.println(header);

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                System.out.println(employee);
            }
        }
    }

//    public static String findEmployeeWithMinSalary(Employee[] employees, Integer... department) {
//        System.out.println("Main.findEmployeeWithMinSalary");
//
//        Employee minSalaryEmployee = null;
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//
//        for (Employee employee : employees) {
//            if ((targetDepartment == -1 || employee.getDepartment() == targetDepartment) &&
//                    (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
//                minSalaryEmployee = employee;
//            }
//        }
//        return String.valueOf(minSalaryEmployee);
//    }
//
//    //
//    public static String findEmployeeWithMaxSalary(Employee[] employees, Integer... department) {
//        System.out.println("Main.findEmployeeWithMaxSalary");
//        Employee maxSalaryEmployee = null;
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//
//        for (Employee employee : employees) {
//            if ((targetDepartment == -1 || employee.getDepartment() == targetDepartment) &&
//                    (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
//                maxSalaryEmployee = employee;
//            }
//        }
//        return String.valueOf(maxSalaryEmployee);
//    }
//
//    public static double calculateTotalSalary(Employee[] employees, Integer... department) {
//        double totalSalary = 0;
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//
//        for (Employee employee : employees) {
//            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
//                totalSalary += employee.getSalary();
//            }
//        }
//        return totalSalary;
//    }
//
//    public static double calculateAverageSalary(Employee[] employees, Integer... department) {
//        double totalSalary = calculateTotalSalary(employees, department);
//        int count = 0;
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//
//        for (Employee employee : employees) {
//            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
//                count++;
//            }
//        }
//        return totalSalary / count;
//    }
//
//    public static void printAllEmployeeNames(Employee[] employees, Integer... department) {
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//        String header = targetDepartment == -1 ? "Список всех сотрудников:" : "Список сотрудников отдела " + targetDepartment + ":";
//        System.out.println(header);
//
//        for (Employee employee : employees) {
//            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
//                System.out.println(employee.getFullName());
//            }
//        }
//    }
//
//    public static void indexation(Employee[] employees, float artIndexation, Integer... department) {
//        int targetDepartment = department.length == 0 ? -1 : department[0];
//
//        for (Employee employee : employees) {
//            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
//                employee.setSalary(employee.getSalary() * (artIndexation));
//            }
//        }
//    }
//
    }
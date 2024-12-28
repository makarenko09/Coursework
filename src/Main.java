public class Main {
    public static void main(String[] args) {
        // Метод для вывода всех сотрудников
        // Массив сотрудников
        Employee[] employees = new Employee[10];

        // Добавление сотрудников
        employees[0] = new Employee("Ivan Ivanov", 1, 50000);
        employees[1] = new Employee("Petr Petrov", 2, 60000);
        employees[2] = new Employee("Maria Smirnova", 3, 55000);
        employees[3] = new Employee("Anna Ivanova", 1, 70000);
        employees[4] = new Employee("Dmitry Sidorov", 4, 48000);
        employees[5] = new Employee("Elena Kozlova", 5, 62000);
        employees[6] = new Employee("Sergey Karpov", 2, 53000);
        employees[7] = new Employee("Olga Orlova", 3, 75000);
        employees[8] = new Employee("Alexey Zaitsev", 4, 59000);
        employees[9] = new Employee("Natalia Romanova", 5, 61000);


        // статистические методы
        printAllEmployees(employees);
        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees));
        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees));
        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees));
        System.out.println("\nСписок ФИО сотрудников:");
        printAllEmployeeNames(employees);

        // проверка корректности работы при изменении любых данных о сотрудниках
        employees[2].setIdCounter(10);
        employees[2].setId(1);
        employees[2].setFullName("Maria Ivanova");
        printAllEmployees(employees);
        employees[4].setSalary(50_000);
        employees[7].setSalary(70_000);
        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees));
        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees));
        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees));
        // индексация
        indexation(employees, 1.1f);
        // статические методы для отдела от 1 до 5-ти
        printAllEmployees(employees, 2);
        // int department = at one to five and all quickly;
        printAllEmployees(employees);
        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees, 5));
        printAllEmployees(employees, 5);
        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees, 1));
        printAllEmployees(employees, 1);
        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees, 3));
        printAllEmployees(employees, 3);
        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees, 3));
        // индексация
        indexation(employees, 0.9f, 3);

        findEmployeeWithMoreUpSalary(employees, 73_900);
findEmployeeWithMoreDownSalary(employees, 55_900);
    }

    // Basic
//    public static void printAllEmployees(Employee[] employees) {
//        System.out.println("Список всех сотрудников:");
//        for (Employee employee : employees) {
//            System.out.println(employee.toString());
//        }
//    }
//
    // Метод для подсчета общей суммы затрат на зарплаты
//    public static double calculateTotalSalary(Employee[] employees) {
//        double totalSalary = 0;
//        for (Employee employee : employees) {
//            totalSalary += employee.getSalary();
//        }
//        return totalSalary;
//    }

    // Метод для поиска сотрудника с минимальной зарплатой
//    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
//        Employee minSalaryEmployee = employees[0];
//        for (Employee employee : employees) {
//            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
//                minSalaryEmployee = employee;
//            }
//        }
//        return minSalaryEmployee;
//    }

    // Метод для поиска сотрудника с максимальной зарплатой
//    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
//        Employee maxSalaryEmployee = employees[0];
//        for (Employee employee : employees) {
//            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
//                maxSalaryEmployee = employee;
//            }
//        }
//        return maxSalaryEmployee;
//    }

    // Метод для подсчета средней зарплаты
//    public static double calculateAverageSalary(Employee[] employees) {
//        double totalSalary = calculateTotalSalary(employees);
//        return totalSalary / employees.length;
//    }

    // Метод для вывода ФИО всех сотрудников
//    public static void printAllEmployeeNames(Employee[] employees) {
//        for (Employee employee : employees) {
//            System.out.println(employee.getFullName());
//        }
//    }

    // Метод индексации ЗП

//    public static void indexation(Employee[] employees, float artIndexation) {
//        for (Employee employee : employees) {
//            employee.setSalary(employee.getSalary() * artIndexation);
//        }
    // Second complexity
//     Метод для поиска сотрудника с максимальной зарплатой
public static void findEmployeeWithMoreUpSalary(Employee[] employees, double someSalary) {
    System.out.println("Main.findEmployeeWithMoreUpSalary");
    System.out.println("Employees with salary greater than " + someSalary + ":");
    for (Employee employee : employees) {
        if (employee.getSalary() > someSalary) {
            System.out.println("ID: " + employee.getId() + ", Full Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
        }
    }
}

    public static void findEmployeeWithMoreDownSalary(Employee[] employees, double someSalary) {
        System.out.println("Main.findEmployeeWithMoreDownSalary");
        System.out.println("Employees with salary less than " + someSalary + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() <= someSalary) {
                System.out.println("ID: " + employee.getId() + ", Full Name: " + employee.getFullName() + ", Salary: " + employee.getSalary());
            }
        }
    }



    public static void printAllEmployees(Employee[] employees, Integer... department) {
        int targetDepartment = department.length == 0 ? -1 : department[0];
        String header = targetDepartment == -1 ? "Список всех сотрудников:" : "Список сотрудников отдела " + targetDepartment + ":";
        System.out.println(header);

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                System.out.println(targetDepartment != -1 ? employee.toString().replace(", department=" + employee.getDepartment(), "") : employee.toString());
            }
        }
    }

public static String findEmployeeWithMinSalary(Employee[] employees, Integer... department) {
    System.out.println("Main.findEmployeeWithMinSalary");

        Employee minSalaryEmployee = null;
        int targetDepartment = department.length == 0 ? -1 : department[0];

        for (Employee employee : employees) {
            if ((targetDepartment == -1 || employee.getDepartment() == targetDepartment) &&
                    (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
    return String.valueOf(minSalaryEmployee);
    }

    //
    public static String findEmployeeWithMaxSalary(Employee[] employees, Integer... department) {
        System.out.println("Main.findEmployeeWithMaxSalary");
        Employee maxSalaryEmployee = null;
        int targetDepartment = department.length == 0 ? -1 : department[0];

        for (Employee employee : employees) {
            if ((targetDepartment == -1 || employee.getDepartment() == targetDepartment) &&
                    (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return String.valueOf(maxSalaryEmployee);
    }

    public static double calculateTotalSalary(Employee[] employees, Integer... department) {
        double totalSalary = 0;
        int targetDepartment = department.length == 0 ? -1 : department[0];

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(Employee[] employees, Integer... department) {
        double totalSalary = calculateTotalSalary(employees, department);
        int count = 0;
        int targetDepartment = department.length == 0 ? -1 : department[0];

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                count++;
            }
        }
        return totalSalary / count;
    }

    public static void printAllEmployeeNames(Employee[] employees, Integer... department) {
        int targetDepartment = department.length == 0 ? -1 : department[0];
        String header = targetDepartment == -1 ? "Список всех сотрудников:" : "Список сотрудников отдела " + targetDepartment + ":";
        System.out.println(header);

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void indexation(Employee[] employees, float artIndexation, Integer... department) {
        int targetDepartment = department.length == 0 ? -1 : department[0];

        for (Employee employee : employees) {
            if (targetDepartment == -1 || employee.getDepartment() == targetDepartment) {
                employee.setSalary(employee.getSalary() * (artIndexation));
            }
        }
    }

}

//        for (int i = 2; i < cats.length-1; i++) {
//            //выполняем перемещение элементов к началу, в результате чего пустая ячейка окажется в конце
//            cats[i-1] = cats[i];
//            cats[i] = null;
//        }

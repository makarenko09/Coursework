public class Main {
    public static void main(String[] args) {
        // Метод для вывода всех сотрудников
        // Массив сотрудников
        EmployeeBook employeeBook = new EmployeeBook(10);
        // Добавление сотрудников
        employeeBook.addEmployee("Ivan Ivanov", 1, 50000);
        employeeBook.addEmployee("Petr Petrov", 2, 60000);
        employeeBook.addEmployee("Maria Smirnova", 3, 55000);
        employeeBook.addEmployee("Anna Ivanova", 1, 70000);
        employeeBook.addEmployee("Dmitry Sidorov", 4, 48000);
        employeeBook.addEmployee("Elena Kozlova", 5, 62000);
        employeeBook.addEmployee("Sergey Karpov", 2, 53000);
        employeeBook.addEmployee("Olga Orlova", 3, 75000);
        employeeBook.addEmployee("Alexey Zaitsev", 4, 59000);
        employeeBook.addEmployee("Natalia Romanova", 5, 61000);
        employeeBook.removeEmployee(10);
        employeeBook.addEmployee("Natalia Ivanova", 3, 120000);

// Вывод всех сотрудников
        for (Employee employee : employeeBook.getEmployees()) {
            if (employee != null) { // Проверяем, что ячейка массива не пуста
                System.out.println(employee);
            }
        }

        Employee[] employees = employeeBook.getEmployees();


//        // статистические методы

//        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees));
//        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees));
//        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
//        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees));
//        System.out.println("\nСписок ФИО сотрудников:");
//        printAllEmployeeNames(employees);
//
//        // проверка корректности работы при изменении любых данных о сотрудниках
//        employees[2].setIdCounter(10);
//        employees[2].setId(1);
//        employees[2].setFullName("Maria Ivanova");
//        printAllEmployees(employees);
//        employees[4].setSalary(50_000);
//        employees[7].setSalary(70_000);
//        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees));
//        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees));
//        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
//        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees));
//        // индексация
//        indexation(employees, 1.1f);
//        // статические методы для отдела от 1 до 5-ти
//        printAllEmployees(employees, 2);
//        // int department = at one to five and all quickly;
//        printAllEmployees(employees);
//        System.out.println("\nСотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employees, 5));
//        printAllEmployees(employees, 5);
//        System.out.println("\nСотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees, 1));
//        printAllEmployees(employees, 1);
//        System.out.println("\nСумма затрат на зарплаты: " + calculateTotalSalary(employees, 3));
//        printAllEmployees(employees, 3);
//        System.out.println("\nСредняя зарплата: " + calculateAverageSalary(employees, 3));
//        // индексация
//        indexation(employees, 0.9f, 3);
//
//        findEmployeeWithMoreUpSalary(employees, 73_900);
//        findEmployeeWithMoreDownSalary(employees, 55_900);
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


}

//        for (int i = 2; i < cats.length-1; i++) {
//            //выполняем перемещение элементов к началу, в результате чего пустая ячейка окажется в конце
//            cats[i-1] = cats[i];
//            cats[i] = null;
//        }

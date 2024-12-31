public class EmployeeBook {
    private Employee[] employees; // Приватный массив сотрудников
    private int size;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }
//    // Метод для добавления нового сотрудника
//    public void addEmployee(String fullName, int department, double salary) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i] == null) {
//                // Используем конструктор Employee напрямую
//                employees[i] = new Employee(fullName, department, salary);
//                return;
//            }
//        }
//        System.out.println("Массив сотрудников заполнен. Добавление невозможно.");
//    }
    // Метод для добавления сотрудника
    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Невозможно добавить сотрудника: массив заполнен.");
            return;
        }
        employees[size++] = new Employee(fullName, department, salary);
    }
/// Метод удаления сотрудника по ID
public void removeEmployee(int id) {
//        int j = id-1;
//        setId
    for (int i = 0; i < employees.length; i++) {
        //
        if (employees[i] != null && employees[i].getId() == id) {
            employees[i] = null; // Удаление сотрудника
            return;
        }
    }
    System.out.println("Сотрудник с ID " + id + " не найден.");
}
    //     for (int i = 2; i < cats.length-1; i++) {
//            //выполняем перемещение элементов к началу, в результате чего пустая ячейка окажется в конце
//            cats[i-1] = cats[i];
//            cats[i] = null;
//        }


    // Метод для получения списка сотрудников
    public Employee[] getEmployees() {
        return employees.clone(); // Возвращаем копию массива для защиты от внешних изменений
    }
    // Second complexity
//     Метод для поиска сотрудника с максимальной зарплатой
    public void findEmployeeWithMoreUpSalary(Employee[] employees, double someSalary) {
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

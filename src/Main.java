public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов", 3, 100000);
        employees[1] = new Employee("Сидор Сидоров", 2, 120000);
        employees[2] = new Employee("Петр Петров", 2, 90000);
        employees[3] = new Employee("Семен Смирнов", 4, 115000);
        employees[4] = new Employee("Ким Чи", 1, 95000);
        employees[5] = new Employee("Дон Кихот", 5, 105000);
        employees[6] = new Employee("Бох Ча", 1, 107000);
        employees[7] = new Employee("Даша Дашич", 5, 97000);
        employees[8] = new Employee("Лена Ленин", 4, 102000);
        employees[9] = new Employee("Анна Гуд", 2, 99000);
        printEmployee(employees);
        System.out.println("Сумма затрат " + getSalarySum(employees));;
        System.out.println("Сотрудник с минимальной затплатой " + getMinSalary(employees));
        System.out.println("Сотрудник с максимальной затплатой " + getMaxSalary(employees));
        System.out.println("Среднее значение зарплат " + getAverageSalary(employees));
        printFullNames(employees);
    }

    private static void printEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int getSalarySum(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    private static Employee getMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee getMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    private static int getAverageSalary(Employee[] employees) {
        int salarySum = getSalarySum(employees);
        return salarySum / employees.length;
    }

    private static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
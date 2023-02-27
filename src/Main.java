import java.util.Random;

public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        fillEmployee();
        printFullInfo();
        System.out.println("Сумма ЗП: " + totalSalaries());
        System.out.println("Сотрудник с мин ЗП " + findEmployeesWithMinSalary());
        System.out.println("Сотрудник с макс ЗП " + findEmployeesWithMaxSalary());
        System.out.println("Средняя ЗП: " + findAverageSalary());
        printFullName();
    }

    private static void fillEmployee() {
        Random random = new Random();
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = new Employee(
                    "Сотрудник " + (i + 1),
                    random.nextInt(1, 6),
                    random.nextInt(45_000, 90_000));
        }
    }
    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee findEmployeesWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static Employee findEmployeesWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static double findAverageSalary() {
        return totalSalaries() / (double) EMPLOYEES.length;
    }
    private static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }
}
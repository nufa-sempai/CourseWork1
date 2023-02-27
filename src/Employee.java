public class Employee {

    private final int id;
    private final String fullName;
    private int departmentId;
    private int salary;
    private static int counterId = 1;

    public Employee(String fullName, int departmentId, int salary) {
        this.id = counterId++;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d, ФИО: %s, ЗП: %d, № отдела: %d",
                id,
                fullName,
                salary,
                departmentId);
    }
}

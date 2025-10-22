//4 exp
public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    public int getEmployeeId() {
        return employee_id;
    }
    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployeeName() {
        return employee_name;
    }
    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployeeSalary() {
        return String.format("$%.2f", employee_salary);
    }
    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Employee Salary: " + getEmployeeSalary());
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Dina");
        emp.setEmployeeSalary(1200.50);

        emp.displayInfo();
    }
}

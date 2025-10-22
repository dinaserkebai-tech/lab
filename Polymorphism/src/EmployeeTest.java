//4 exp


abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Programmer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 5000.0, 1200.0);
        Employee programmer = new Programmer("Bob", 4000.0, 10, 50.0);

        System.out.println(manager.getName() + "'s Salary: $" + manager.calculateSalary());
        System.out.println(programmer.getName() + "'s Salary: $" + programmer.calculateSalary());
    }
}
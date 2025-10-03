abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double baseSalary;
    Manager(String name, double baseSalary) { super(name); this.baseSalary = baseSalary; }

    double calculateSalary() { return baseSalary + 5000; }
    void displayInfo() {
        System.out.println("Manager: " + name + " | Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    double baseSalary;
    Programmer(String name, double baseSalary) { super(name); this.baseSalary = baseSalary; }

    double calculateSalary() { return baseSalary + 2000; }
    void displayInfo() {
        System.out.println("Programmer: " + name + " | Salary: " + calculateSalary());
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 30000);
        Employee p = new Programmer("Bob", 25000);

        m.displayInfo();
        p.displayInfo();
    }
}

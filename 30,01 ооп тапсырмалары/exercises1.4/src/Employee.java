//1.4
public class Employee {   // Save as "Employee.java"

    // private instance variables
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method: getName (returns full name)
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // Method: getAnnualSalary
    public int getAnnualSalary() {
        return this.salary * 12;
    }

    // Method: raiseSalary
    public int raiseSalary(int percent) {
        this.salary = this.salary + this.salary * percent / 100;
        return this.salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + this.id + ",name=" + this.getName() + ",salary=" + this.salary + "]";
    }
}

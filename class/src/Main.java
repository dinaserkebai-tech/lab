public class Main {
    public static void main(String[] args) {
        // 1) Rectangle
        System.out.println("=== Rectangle Test ===");
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());

        // 2) Employee
        System.out.println("\n=== Employee Test ===");
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());
        System.out.println("raiseSalary 10% → " + e1.raiseSalary(10));
        System.out.println(e1);

        //3) InvoiceItem
        System.out.println("\n=== InvoiceItem Test ===");
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());
        System.out.println("The total is: " + inv1.getTotal());

        //4) Account
        System.out.println("\n=== Account Test ===");
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);

        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);

        // 5) Date
        System.out.println("\n=== Date Test ===");
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);

        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }
}

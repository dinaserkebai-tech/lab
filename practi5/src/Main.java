
public class Main {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int age;
            private double gpa;
            Student(String name, int age, double gpa) {
                this.name = name;
                this.age = age;
                this.gpa = gpa;
            }
            public String getName() {
                return name;
            }
            public double getGpa() {
                return gpa;
            }
            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
            public void setName(String name) {
                this.name = name;
            }
            public void setGpa(double gpa) {
                this.gpa = gpa;
            }
            void displayInfo() {
                System.out.println("Name" + name);
                System.out.println("Age" + age);
                System.out.println("GPA: " + gpa);
            }
        }
        Student student1 = new Student("Marlen", 20, 3.4);
        Student student2 = new Student("Mico", 22, 34);
        student1.displayInfo();
        student2.displayInfo();
        student1.setGpa(3.8);
        student1.setName("Dinara");
    }
}
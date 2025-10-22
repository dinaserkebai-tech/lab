//7 exp


import java.util.ArrayList;
public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Double> grades;
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }
    public ArrayList<Double> getGrades() {
        return new ArrayList<>(grades); // Return a copy to preserve encapsulation
    }
    public boolean addGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            grades.add(grade);
            return true;
        } else {
            System.out.println("Invalid grade. Must be between 0 and 100.");
            return false;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Alice");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        student.addGrade(85.5);
        student.addGrade(92.0);
        student.addGrade(-10);
        student.addGrade(105);

        System.out.println("Grades: " + student.getGrades());
    }
}
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private ArrayList<String> courses;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }

    public boolean isAdult() {
        return age >= 18;
    }
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("ID студента: " + studentId);
        System.out.println("Курсы: " + courses);
        System.out.println("Взрослый: " + (isAdult() ? "Да" : "Нет"));
    }
}
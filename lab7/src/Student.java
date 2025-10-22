interface university{
    void student_group();
    void student_team();
}
abstract class Student implements university{
    private String student_name;
    private int student_id;
    private double student_gpa;
    public Student(String student_name,int student_id,double student_gpa){
        this.student_name=student_name;
        this.student_id=student_id;
        this.student_gpa=student_gpa;

    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

}

/**
 * Student.java
 * Unit 7 Programming Assignment
 * Student Management System GUI
 */

public class Student {

    private String studentId;
    private String studentName;
    private String course;
    private String grade;


    // Constructor
    public Student(String studentId,
                   String studentName,
                   String course,
                   String grade) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.grade = grade;

    }


    // Getter methods

    public String getStudentId() {
        return studentId;
    }


    public String getStudentName() {
        return studentName;
    }


    public String getCourse() {
        return course;
    }


    public String getGrade() {
        return grade;
    }



    // Setter methods

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public void setCourse(String course) {
        this.course = course;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

}
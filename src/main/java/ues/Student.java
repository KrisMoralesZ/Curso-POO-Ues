package ues;

public class Student extends User {
    private String course;

    public Student(String name, String lastName, String email, String course) {
        super(name, lastName, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

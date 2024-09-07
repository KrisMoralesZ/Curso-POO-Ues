package ues;

public class Teacher extends User {
    private String courses;

    public Teacher(String name, String lastName, String email, String courses) {
        super(name, lastName, email);
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

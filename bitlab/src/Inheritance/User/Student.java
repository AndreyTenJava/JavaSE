package Inheritance.User;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(){}

    public Student(int id, String login, String password, String name, String surname, double gpa, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = indexOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
    int index = 0;
    public void addCourse(String course){
        for(int i = 0; i < course.length(); i++);
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println("gpa: " + gpa + " indexOfCourses: " + indexOfCourses);
    }
}

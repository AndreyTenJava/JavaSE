package Serializable.Student;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
    private String name;
    private String surname;
    private ArrayList<Subject> subjects = new ArrayList();

    public Student(String name1, int credits) {}

    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }

    public void getData()
    {
        System.out.println("name: " + name + ", surname: " + surname  + ", subjects: " + subjects);

        for (Subject subject : subjects) {
            subject.toString();
        }

    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
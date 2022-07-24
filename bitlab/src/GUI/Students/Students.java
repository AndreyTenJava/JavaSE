package GUI.Students;

public class Students {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private String group;

    public Students(){}

    public Students(int id, String name, String surname, String faculty, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" + " id= " + id + ", Name: " + name + ", Surname: " + surname + ", faculty: " + faculty + ", group: " + group + '\n' + "}";
    }
}

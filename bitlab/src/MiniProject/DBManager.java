package MiniProject;

import JDBC.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;

    public void connect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sample?useUnicode=true&serverTimezone=UTC","root", "");
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void addStudent(Students students) {
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO students(id, name, surname, age) values(NULL,?,?,?)");
            ps.setString(1, students.getName());
            ps.setString(2, students.getSurname());
            ps.setInt(3, students.getAge());

            ps.executeUpdate();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Students> getAllStudents(){
        ArrayList<Students> students = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");


                students.add(new Students(id, name, surname, age));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}

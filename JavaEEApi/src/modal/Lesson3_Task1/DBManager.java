package modal.Lesson3_Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private static Connection connection;

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitlab_test?useUnicode=true&serverTimezone=UTC",
                    "root", "");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addStudents(Students student) {

        int rows = 0;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO students (id, name, surname, birthdate, city_id)" +
                    "VALUES (NULL, ?, ?, ?, ?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getBirthdate());
            statement.setLong(4, student.getCity().getId());
            rows = statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static ArrayList<Students> getAllStudents() {
        ArrayList<Students> studentsList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT st.id, st.name, st.surname, st.birthdate, st.city_id, c.name AS cityName, c.code " +
                    "FROM students st " +
                    "INNER JOIN city c ON st.city_id = c.id");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                studentsList.add(new Students(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("birthdate"),
                        new City(
                                resultSet.getLong("city_id"),
                                resultSet.getString("cityName"),
                                resultSet.getString("code")

                        )
                ));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentsList;
    }

    public static Students getStudent(Long id){
        Students student = null;

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT st.id, st.name, st.surname, st.birthdate, st.city_id, c.name AS cityName, c.code " +
                    "FROM students st " +
                    "INNER JOIN city c ON st.city_id = c.id" +
                    " WHERE st.id = ?");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                student = new Students(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("birthdate"),
                        new City(
                                resultSet.getLong("city_id"),
                                resultSet.getString("cityName"),
                                resultSet.getString("code")
                        )
                );
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }

    public static boolean saveStudent (Students student) {

        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "UPDATE students SET name = ?, surname = ?, birthdate = ?, city_id = ? " +
                    "WHERE id = ?");

            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getBirthdate());
            statement.setLong(4, student.getCity().getId());
            statement.setLong(5, student.getId());

            rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static boolean deleteStudent (Students student) {
        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM students WHERE id = ?");

            statement.setLong(1, student.getId());

            rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static ArrayList<City> getAllCities() {
        ArrayList<City> cities = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM city");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                cities.add(new City(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("code")
                ));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cities;
    }

    public static City getCity(Long id){
        City city = null;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM city WHERE id = ?");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                city = new City(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("code")
                );
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return city;
    }

    public static boolean addCity(City city) {

        int rows = 0;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO  (id, name, code)" +
                    "VALUES (NULL, ?, ?)" +
                    "");
            statement.setString(1, city.getName());
            statement.setString(2, city.getCode());
            rows = statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static boolean saveCity (City city) {

        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "UPDATE city SET name = ?, code = ?" +
                    "WHERE id = ?");

            statement.setString(1, city.getName());
            statement.setString(2, city.getCode());
            statement.setLong(3, city.getId());

            rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }

    public static boolean deleteCity (City city) {
        int rows = 0;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM city WHERE id = ?");

            statement.setLong(1, city.getId());

            rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return rows > 0;
    }
}

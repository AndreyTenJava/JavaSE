package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sample?useUnicode=true&serverTimezone=UTC","root", "");
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public ArrayList<Items> getAllItems(){
        ArrayList<Items> items = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM items");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");

                items.add(new Items(id, name, price));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }

    public void addItem(Items item){
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO items(id, name, price) values(NULL,?,?)");

            ps.setString(1, item.getName());
            ps.setDouble(2, item.getPrice());

            ps.executeUpdate();
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteItems(Long id){
        try{
            PreparedStatement ps = connection.prepareStatement("DELETE FROM items where id = ?");
            ps.setLong(1, id);
            ps.executeUpdate();

            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

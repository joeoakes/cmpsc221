package Derby;

//Joe Oakes

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        //String url = "jdbc:derby:myDB;create=true";  // embedded mode
        String url = "jdbc:derby:C:/Users/joeoa/myDB3;create=true";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("Drop Table users");
            stmt.executeUpdate("CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50))");
            stmt.executeUpdate("INSERT INTO users VALUES (1, 'Joe')");
            stmt.executeUpdate("INSERT INTO users VALUES (2, 'Jim')");
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

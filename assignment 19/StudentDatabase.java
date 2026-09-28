package assignment 19;

import java.sql.*;

public class StudentDatabase {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM Student";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("branch") + " " +
                    rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
package game;


import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
    public static void main(String[] args) throws SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "zycc0033");
        if (connection == null) {
            System.out.println("JDBC connection is not established");
            return;
        } else
            System.out.println("Congratulations," +
                    " JDBC connection is established successfully.\n");
        connection.close();
//        Statement statement = connection.createStatement();
//
//        Result result = statement.executeQuery("select * from people");



    }
}

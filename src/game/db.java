package game;


import javax.xml.transform.Result;
import java.sql.*;

public class db {
    public static void main(String[] args) throws SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/rmitlab", "root", "zycc0033");

        Statement statement = connection.createStatement();
        String aa = "select * from student";
        ResultSet result = statement.executeQuery(aa);

        boolean flag = false;
        while (result.next()){
            flag = true;
            System.out.println(result.getInt(1) + " " + result.getString(2));
        }
        if (flag == true){
            System.out.println("record received and displayed");
        }
        else {
            System.out.println("records not found");
        }

        result.close();
        connection.close();
//
//



    }
}

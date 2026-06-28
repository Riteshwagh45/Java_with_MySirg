import java.sql.*;
import java.util.*;
public class TestDB{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "7020";
try {


    Connection con = null;
    con = DriverManager.getConnection(url, user, password);
    System.out.println("Connected successfully...");
}
catch (SQLException e) {
    System.out.println(e.getMessage());
}
    }
}
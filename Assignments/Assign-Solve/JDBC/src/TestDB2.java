
import java.sql.*;

public class TestDB2 {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/db3";
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);

        //insert the data
        PreparedStatement ps = con.prepareStatement(
                "insert into db3 values(?,?,?,?,?)"

        );
        ps.setInt(1,1);
        ps.setString(2,"java");
        ps.setDouble(3,200);
        ps.setString(4,"ritesh");
        ps.setString(5,"wagh");

        ps.executeUpdate();
        System.out.println("data inserted...");

        //printing the data



    }
}

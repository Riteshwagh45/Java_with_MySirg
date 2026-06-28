import java.sql.*;
public class CRUDExample {
    static Connection con = null;

    public static void CreateDataBase(String DBname) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "7020";
        con = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();
        st.executeUpdate("create database if not exists " +DBname);
        System.out.println("database created successfully " +DBname);
        st.close();
        con.close();

    }
    public static void CreateTable(String TBName , String DBname) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" +DBname;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();

         //create table with fields id , name , marks
        int rows = st.executeUpdate("create table if not exists " + TBName + "(id int PRIMARY KEY, name varchar(50) , marks int)");
        st.close();
        con.close();

    }
    public static void insertData(int id , String name , int marks , String DBname , String TbName) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" +DBname;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);
        String sql = "insert into " + TbName + "(id , name , marks) values(? , ? , ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1 , id);
        ps.setString(2 , name);
        ps.setInt(3, marks);

        int rows = ps.executeUpdate();
        System.out.println("Inserted Rows:" +rows);
        ps.close();
        con.close();
    }
    public static void viewData(String DBname , String TbName) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" +DBname;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);

        String sql = "SELECT * FROM " +TbName;
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()){

            int id      = rs.getInt("id");
            String name = rs.getString("name");
            int marks   = rs.getInt("marks");

            System.out.println(id +" " + name +" " +marks);
        }
        rs.close();
        ps.close();
        con.close();


    }
    public static void UpdateData(String DbName , String TbName, String newName , int id) throws SQLException{
        //in this method you can change the student name using student id
        String url = "jdbc:mysql://localhost:3306/" +DbName;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);

        String sql = "Update " + TbName + " SET name = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1 , newName);
        ps.setInt(2,id);

        int rows = ps.executeUpdate();
        //if id is invalid
         if(rows > 0){
             System.out.println("Data updated successfully:" +rows);
         }
         else{
             System.out.println("not valid ID");
         }

        ps.close();
        con.close();
    }
    public static void DeleteRecord(String DbName , String TbName , int id) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" +DbName;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);

        String sql = "delete from " + TbName + " where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);

      int rows = ps.executeUpdate();

      if(rows > 0){
          System.out.println("Record Deleted:" +rows);
      }
      else{
          System.out.println("Invalid data...");
      }

      ps.close();
      con.close();

    }
    public static void DeleteTable(String DbName , String TbName) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/" +DbName;
        String user = "root";
        String pass = "7020";
        con = DriverManager.getConnection(url,user,pass);

        String sql = "drop table if exists " +TbName;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println(TbName+" table deleted successfully");

        ps.close();
        con.close();
    }

    public static void viewAllDatabases() throws  SQLException{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "7020";
        con = DriverManager.getConnection(url,user,pass);
        String sql = "show databases";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString(1)); //show databases
        }
    }
    public static void deleteDatabase(String DbName) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);
        String sql = "drop database if exists " +DbName;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();

        System.out.println(DbName+ " is successfully deleted..!");
    }
    public static void viewTables(String DbName) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/ " +DbName;
        String user = "root";
        String pass = "7020";

        con = DriverManager.getConnection(url,user,pass);
        String sql = "show tables from " +DbName;
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("Tables: " +rs.getString(1));
        }

    }
    public static void main(String[] args) throws SQLException{

      //  CreateDataBase("Mydb");
        // CreateTable("student2" , "Mydb");
     //   insertData(1,"ritesh",100,"Mydb","student");
       // viewData("Mydb","student");
       // UpdateData("Mydb","student","ritesh",1);
      //  viewData("Mydb","student");
       // DeleteRecord("Mydb","student",1);
        //viewData("Mydb","student");
       // DeleteTable("Mydb","as");
        //viewAllDatabases();
        //viewTables("Mydb");
       // viewAllDatabases();
       // deleteDatabase("zudio");
        //viewAllDatabases();


    }
}

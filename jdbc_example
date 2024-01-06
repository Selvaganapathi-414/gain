import java.sql.*;
import java.io.*;
import java.util.Scanner;
class Jdbc{
    public static void main(String[] args) throws Exception {
        insert();
        insertsts();
        delete();
        update();
        resource();
    }
    public static void resource() throws Exception{
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        String url = "jdbc:mysql://localhost:3306/selva";
        String uname = "root";
        String pwd = "Selva@123sql";
        String query = "select * from employee";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, uname, pwd);
        statement = connection.createStatement();
        resultset = statement.executeQuery(query);
        while(resultset.next()){
            System.out.print(resultset.getInt(1));
            System.out.print(resultset.getString(2));
            System.out.println(resultset.getInt(3));
        }
        resultset.close();
        statement.close();
        connection.close();
    }
    public static void delete() throws Exception{
        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/selva";
        String uname = "root";
        String pwd = "Selva@123sql";
        int id=1;
        String query = "delete from employee where empid="+id+";";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, uname, pwd);
        statement = connection.createStatement();
        int resultset = statement.executeUpdate(query);
        statement.close();
        connection.close();
    }
    public static void insert() throws Exception {

        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/selva";
        String uname = "root";
        String pwd = "Selva@123sql";
        String query = "insert into employee values(3,'ram',90000)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, uname, pwd);
        statement = connection.createStatement();
        int resultset = statement.executeUpdate(query);
        System.out.println(resultset);
        statement.close();
        connection.close();
    }
    public static void insertsts() throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/selva";
        String uname = "root";
        String pwd = "Selva@123sql";
        int empid=4,Salary=820000;
        String ename="hari";
        String query="insert into employee values(?,?,?);";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, uname, pwd);
        statement =connection.prepareStatement(query);
        statement.setInt(1, empid);
        statement.setString(2, ename);
        statement.setInt(3, Salary);
        int s=statement.executeUpdate();
        statement.close();
        connection.close();
    }
    public static void update() throws Exception{
        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/selva";
        String uname = "root";
        String pwd = "Selva@123sql";
        String query = "update employee set ename='selva' where empid=3;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, uname, pwd);
        statement = connection.createStatement();
        int resultset = statement.executeUpdate(query);
        statement.close();
        connection.close();
    }
}

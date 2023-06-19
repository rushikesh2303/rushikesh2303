import java.sql.*;
import java.io.*;
public class CWH_38_JDBCDemo {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql:empdb","postgres","12345");
            if(con==null){
                System.out.println("Connection Failed.............");
            }
            else{
                System.out.println("Connection Successful................");
                stmt = con.createStatement();
                rs=stmt.executeQuery("select * from emp");
                while (rs.next()){
                    System.out.println("EmpID = "+rs.getInt(1));
                    System.out.println("EmpName = "+rs.getString(2));
                    System.out.println("Salary= "+rs.getInt(3));
                    System.out.println("");
                }
                con.close();
            }
        }
        catch(Exception e){
            System.out.println("Error............"+e);
        }
    }
}
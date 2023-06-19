import java.sql.*;
import java.io.*;
public class CWH_34_JdbcFirst {
    public static void main(String[] args) {
        try {
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver Loaded.......");
                Connection con=DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","12345");
                System.out.println("Connection Establish.............");
                Statement st=con.createStatement();
                System.out.println("Statement Created..............");
                ResultSet rs=st.executeQuery("Select * from Student");
                System.out.println("Retrive Data..........");
                while (rs.next())
                {
                    System.out.print(rs.getInt(1)+"\t");
                    System.out.print(rs.getString(2)+"\t");
                    System.out.print(rs.getFloat(3)+"\t");
                    System.out.println("\t");
                }
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error"+e);
            }
        }
    }

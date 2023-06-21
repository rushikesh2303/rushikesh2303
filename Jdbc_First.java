import java.sql.*;
import java.io.*;
public class Jdbc_First {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded.......");
            Connection con=DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","");
            System.out.println("Connection Establish.............");
            Statement st=con.createStatement();
            System.out.println("Statement Created..............");
            ResultSet rs=st.executeQuery("Select * from Student");
            System.out.println("Retrive Data..........");
            while (rs.next())
            {
                System.out.print(rs.getInt(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getFloat(3));
                System.out.println("");
            }
            con.close();
        } 
        catch (Exception e) {
            System.out.println("Error"+e);
        }
    }    
}
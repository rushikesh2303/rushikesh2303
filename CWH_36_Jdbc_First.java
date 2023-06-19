import java.sql.*;
import java.io.*;
public class CWH_36_Jdbc_First {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded.......");
            Connection con=DriverManager.getConnection("jdbc:postgresql:tybcs","postgres","12345");
            System.out.println("Connection Establish.............");
            Statement st=con.createStatement();
            System.out.println("Statement Created..............");
            ResultSet rs=st.executeQuery("select * from emp");
            System.out.println("Retrive Data..........");
            System.out.println("Student Id \t Student Name \t Student Per");
            while (rs.next())
            {
                System.out.print(rs.getInt(1));
                System.out.print("\t\t\t\t"+rs.getString(2));
                System.out.print("\t\t\t\t"+rs.getFloat(3));
                System.out.println("");
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
}

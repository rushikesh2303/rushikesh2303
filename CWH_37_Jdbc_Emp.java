import java.sql.*;
import java.io.*;
public class CWH_37_Jdbc_Emp {
        public static void main(String[] args) {
            try {
                int eno,esal,lim;
                String ename;
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver Loaded ............");
                Connection con = DriverManager.getConnection("jdbc:postgresql:ty2023","postgres","12345");
                System.out.println("Connection Established............");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("How many record want to be insert ?");
                lim = Integer.parseInt(br.readLine());
                for (int i=0;i<lim;i++)
                {
                    System.out.println("Enter Employee No =  ");
                    eno = Integer.parseInt(br.readLine());
                    System.out.println("Enter Employee Name =  ");
                    ename = br.readLine();
                    System.out.println("Enter Employee Salary =   ");
                    esal = Integer.parseInt(br.readLine());
                    PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
                    ps.setInt(1,eno);
                    ps.setString(2,ename);
                    ps.setInt(3,esal);
                    int j = ps.executeUpdate();
                    System.out.println("j = "+j);
                }
                Statement st = con.createStatement();
                System.out.println("Statement Created ......");
                ResultSet rs = st.executeQuery("select * from emp");
                System.out.println("**** Employee Record **** \n");
                System.out.println("Emp No \t Emp Name \t Emp Salary ");
                while(rs.next())
                {
                    System.out.print(" "+rs.getInt((1)));
                    System.out.print("\t\t"+rs.getString(2));
                    System.out.print("\t\t"+rs.getInt(3));
                    System.out.println();
                }
                System.out.println("Enter Employee No to be Search = ");
                int no = Integer.parseInt(br.readLine());
                Statement st1= con.createStatement();
                System.out.println("Statement Created ...........");
                ResultSet rs1 = st1.executeQuery("select * from emp where eno = + '"+no+"'");
                System.out.println("**** Employee Record **** \n");
                System.out.println("Emp No \t Emp Name \t\t Emp Salary");
                while(rs1.next()){
                    System.out.print(" "+rs1.getInt((1)));
                    System.out.print("\t\t"+rs1.getString(2));
                    System.out.print("\t\t"+rs1.getInt(3));
                    System.out.println();
                }
                System.out.println("Enter Employee Name To Be Search =");
                String name = br.readLine();
                Statement st2 = con.createStatement();
                System.out.println("Statement Created ..........");
                ResultSet rs2 = st2.executeQuery("select * from emp where ename = '"+name+"'");
                System.out.println("**** Employee Record ****\n ");
                System.out.println("Emp No \t Emp Name \t\t Emp Salary");
                while(rs1.next()){
                    System.out.print(" "+rs2.getInt((1)));
                    System.out.print("\t\t"+rs2.getString(2));
                    System.out.print("\t\t"+rs2.getInt(3));
                    System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Error"+e);
            }
        }
    }

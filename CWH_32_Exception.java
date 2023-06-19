import java.util.Scanner;
public class CWH_32_Exception {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age For Checking ");
        int age=sc.nextInt();
        try{
            if (age<=18){
                throw new Exception();
            }
            else {
                System.out.println("You Are Eligible To Vote");
            }
        }
        catch (Exception e){
            System.out.println("Age are Small");
            System.out.println(e);
        }
        finally {
            System.out.println("You are checking are finished .........");
        }
    }
}

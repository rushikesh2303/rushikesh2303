import java.io.IOException;
import java.util.Scanner;
class CWH_31_Exception{
    public static void main(String args[]) throws IOException
    {
        int rev=0;
        int rem,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number You Have To reverse ");
        n=sc.nextInt();
        try
        {
            if (n==0)
            {
                throw new IOException();
            }
            else {
                while(n>0)
                {
                    rem = n % 10;
                    rev = rev * 10 + rem;
                    n = n / 10;
                }
                System.out.println("Reverse Number Is ="+rev);
            }
        }
        catch(IOException e)
        {
            System.out.println("Zero Number Exception");
            System.out.println(e);
        }
        finally
        {
            System.out.println("In finally always execute");
        }
        System.out.print("Program Are Successfully Run ");
    }
}
import java.util.Scanner;
public class CWH_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.println("Enter A Number You Want To Multiplication : ");
        n=input.nextInt();
        for (i=1;i<=10;i++)
        {
            System.out.printf(" %d X %d = %d \n ",n,i,n*i);
        }
    }
}

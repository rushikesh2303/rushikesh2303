import java.util.Scanner;
public class CWH_26_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, sum=0,temp;
        System.out.println("Enter A Number You Want To Palindrome Check :: ");
        int n = sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum= (sum*10)+r;
            n=n/10;
        }
        if (temp==sum) {
            System.out.println("Number Is not palindrome ");
        }
        else {
            System.out.println("Number is  palindrome ");
        }
    }
}

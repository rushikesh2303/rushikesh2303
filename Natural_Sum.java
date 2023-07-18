import java.util.*;
public class Natural_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
        for (int i = 0; i < n+1; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of first %d Number is = "+n);
        System.out.println(sum);
    }
}

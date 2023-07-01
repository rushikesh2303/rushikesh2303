import java.util.*;
public class Even_n {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter Number : \n");
        n=sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i%2==0) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

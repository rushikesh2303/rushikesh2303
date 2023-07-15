import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[]=new int[5];
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < number.length; i++) {
            number[i]=sc.nextInt();
        }
        System.out.println("Enter Number To search : ");
        int x=sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i]==x) {
                System.out.println("x Found at index : "+i);
            }
        }
        sc.close();
    }
}

import java.util.Scanner;
import java.util.TreeSet;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Object> ts = new TreeSet<>();
        System.out.println("Enter How many Colours :");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " Colours :");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String c = sc.nextLine();
            ts.add(c);
        }
        System.out.println("Colours :" + ts);
        sc.close();
    }
}
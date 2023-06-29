import java.util.Scanner;

public class Input_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Name \n ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
        
    }
}

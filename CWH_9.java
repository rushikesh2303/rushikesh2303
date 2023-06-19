import java.util.Scanner;

public class CWH_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float S1, S2, S3, S4, S5, All, Per;
        System.out.println("Enter Your Physics Mark :");
        S1 = sc.nextFloat();
        System.out.println("Enter Your Chemestry Mark :");
        S2 = sc.nextFloat();
        System.out.println("Enter Your Math Mark :");
        S3 = sc.nextFloat();
        System.out.println("Enter Your Biology Mark :");
        S4 = sc.nextFloat();
        System.out.println("Enter Your English Mark :");
        S5 = sc.nextFloat();
        System.out.println("Your Total Mark Are : ");
        All = S1+S2+S3+S4+S5;
        System.out.println(All);
        Per=All/500*100;
        System.out.println(Per);
        if (Per>75){
            System.out.println("You Are Passed , With Distingction");
        }
        else if (Per<35){
            System.out.println("You Are Fail, Please Study Hard ! ");
        }
        else if (Per>35) {
            System.out.println("You Are Passed ! ");
        }

    }
}

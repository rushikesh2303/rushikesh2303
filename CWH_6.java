import java.util.Scanner;

public class CWH_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Phy, Chem, Math, Bio, Eng;
        System.out.println("Enter Your Phy Mark  : ");
        Phy = sc.nextInt();
        System.out.println("Enter Your Chem Mark  : ");
        Chem = sc.nextInt();
        System.out.println("Enter your Math Mark   : ");
        Math = sc.nextInt();
        System.out.println("Enter Your Bio Mark   : ");
        Bio = sc.nextInt();
        System.out.println("Enter Your Eng Mark   : ");
        Eng = sc.nextInt();
        float Average=Phy+Chem+Math+Bio+Eng;
        float Percentage=Average/500.0f*100.0f;
        System.out.println("Your Percentage Is ");
        System.out.println(Percentage);
        System.out.println("Your CGPA Is  ");
        float cgpa = Percentage/9.5f;
        System.out.println(cgpa);
    }
}

import java.util.Scanner;

public class CWH_8_If_else {
    public static void main(String[] args) {

//        If_Else_Statement
//        int age=5;
//        if (age>=18){
//            System.out.println("You Can Drive");
//        }
//        else {
//            System.out.println("You Can't Drive");
//        }

        int age;
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You Are Experienced !");
        }
        else if (age>46){
            System.out.println("You Are Semi-Experienced !");
        }
        else if (age>36){
            System.out.println("You Are Semi-Semi Experienced !");
        }
        else if (age>18){
            System.out.println("You Are Fresher !");
        }
        else {
            System.out.println("You Are Not Experienced !");
        }

    }
}

import java.util.Scanner;
public class Diwali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type Your Name : ");
        String Name = sc.next();
        System.out.println("H A P P Y   D I W A L I   "+Name);
        int date;
        System.out.println("Enter Current Date : ");
        date=sc.nextInt();
        if (date<31 && date>1) {
            if (date == 24) {
                System.out.println("H A P P Y   D H A N T R A Y O D A S H I ");
            } else if (date == 25) {
                System.out.println("H A P P Y   D I W A L I    " + Name + "   W I T H   F A T A K E ");
            } else if (date == 26) {
                System.out.println("H A P P Y   B H A U B H I J ");
                System.out.println("H A P P Y    D I W A L I   P A D A V A ");
            } else if (date == 27) {
                System.out.println("G O   B A C K   T O   C O L L E G E");
            } else {
                System.out.println("P A D A I   K A R O \t D I W A L I    A A T I    J A T I     H A I");
            }
        }
        else {
            System.out.println("Enter Valid Date ");
        }
    }
}

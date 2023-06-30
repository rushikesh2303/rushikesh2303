import java.util.Scanner;
class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        // double Result = 0;
        switch (op) {
            case '+':
                System.out.println("Addition =");
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Substraction = ");
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Multiplication = ");
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Division = ");
                System.out.println(a/b);
                break;
            case '%':
                System.out.println("Modulo = ");
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter Valid Expression Or Number !");
                break;
        }
        sc.close();
    }
}

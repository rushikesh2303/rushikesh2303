public class CWH_20_Factorial {
    public static void main(String[] args) {
        int n,i,factorial=1;
        n=11;
        i=1;
        while (i<=n)
        {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}

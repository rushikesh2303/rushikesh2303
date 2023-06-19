public class CWH_17_Star_Pattern {
    public static void main(String[] args) {

        int n=4;
        for (int i=n; i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

        int g=4;
        for (int i=0; i<=g ;i++)
        {
            for (int a=0;a<i;a++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
}

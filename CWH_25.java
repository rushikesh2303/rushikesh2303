public class CWH_25 {
        static void Multiplication(int n)
        {
            for(int i=1 ; i<=10 ; i++)
            {
                System.out.format("%d * %d = %d \n",n,i,n*i);
            }
        }
        static void StarFunction(int a)
        {
            for (int i=0; i<=a; i++)
            {
                for (int j=0; j<i;j++)
                {
                    System.out.print(" * ");
                }
                System.out.print(" \n ");
            }
        }
        static void StarMirror(int z)
        {
            for (int i=z; i>=0 ; i--)
            {
                for (int j=0; j<i ; j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        static void Natural(int z)
        {
            int Add=0;
            for (int i=1; i<=z; i++)
            {
                Add= Add+i;
            }
            System.out.println("Sum Of N Natural Number "+ Add);
        }
        public static void main(String args[])
        {
//            Multiplication(9);
//            StarFunction(5);
//            StarMirror(6);
            Natural(20);

        }
}

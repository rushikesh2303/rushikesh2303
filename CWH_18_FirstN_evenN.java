public class CWH_18_FirstN_evenN {
    public static void main(String[] args) {
//        First N Even Number Addition
        int i,sum=0;
        int n=10;
        for (i=0;i<n;i++)
        {
            sum=sum+(i*2);
        }
        System.out.println("Sum Of Even Number : ");
        System.out.println(sum);

//        First N Odd Number Addition
        int j,add=0;
        int a=10;
        for (j=0;j<a;j++)
        {
            add=add+(j*2+1);
        }
        System.out.println("Sum Of Odd Number : ");
        System.out.println(add);
    }
}

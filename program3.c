#include<stdio.h>
#include<conio.h>
int main()
{
    int i,n,j,loc,temp,a[10];
    printf("\n Enter array limit : ");
    scanf("%d",&n);
    printf("\n Enter array element : ");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    for ( i = 0; i < n-1; i++)
    {
        loc=i;
        for ( j = i+1; j < n; j++)
        {
            if (a[loc]>a[j])
            {
                loc=j;
            }
        }
        if (loc !=i)
        {
            temp=a[i];
            a[i]=a[loc];
            a[loc]=temp;
        }       
    }
    printf("\n Sorted array as : ");
    for ( i = 0; i < n; i++)
    {
        printf("\t%d",a[i]);
    }
    return 0;
}
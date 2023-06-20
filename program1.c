#include<stdio.h>
int main()
{
    int i,n,element,a[10];
    printf("\n Enter array limit :");
    scanf("%d",&n);
    printf("\n Enter array element :");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n Enter element to be search :");
    scanf("%d",&element);
    for (i = 0; i < n; i++)
    { 
        if (element==a[i])
        {
            printf("\n Element %d found at location %d \n",element,i);
            break;
        }
    }
    if (i==n)
    {
        printf("\n Element not found ");
    }
    return 0;
}
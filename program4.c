#include<stdio.h>
int main()
{
    int i,n,element,a[100];
    printf("\n Enter array limit : ");
    scanf("%d",&n);
    printf("\n Enter array element : ");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n Enter element to be search :");
    scanf("%d",&element);
    for ( i = 0; i < n; i++)
    {
        if (element == a[i])
        {
            printf("\n element %d found at location %d ",element,i);
            return 0;
        }
    }
    if (i==n)
    {
        printf("\n Element Not Found ");
    }
    return 0;
}
#include<stdio.h>
int main()
{
    int radius,area;
    float pi=3.14;
    printf("\n Enter Radius :",radius);
    scanf("%d",&radius);
    area=pi*radius*radius;
    printf("\n Area Of Circle : %d",area);
    return 0;
}
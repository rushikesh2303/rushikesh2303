#include<stdio.h>
int main()
{
    int phy,che,bio,math,percentage;
    printf("Enter Phy Mark :",phy);
    scanf("%d",&phy);
    printf("Enter Che Mark :",che);
    scanf("%d",&che);
    printf("Enter Bio Mark :",bio);
    scanf("%d",&bio);
    printf("Enter Math Mark :",math);
    scanf("%d",&math);
    percentage=(phy+che+bio+math)/4;
    printf("Percentage of  Mark :%d",percentage);
    return 0;
}
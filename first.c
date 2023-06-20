#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    struct node *prev;
    struct node *next;
}*start=NULL, *tmp, *q;
int main()
{
    int n,i,data;
    printf("\n Enter Limit Of List : ");
    scanf("%d",&n);
    printf("\n Enter %d Element : ",n);
    i=0;
    while (i<n)
    {
        scanf("%d",&data);
        tmp=malloc(sizeof(struct node));
        tmp->info=data;
        tmp->prev=NULL;
        tmp->next=NULL;
        if (start==NULL)
        {
            start=tmp;
        }
        else
        {
            q=start;
            while(q->next!=NULL)
            {
                q=q->next;
            }
            q->next=tmp;
            tmp->prev=q;
        }
        i++;
    }
    printf("List Created !\n ");
}

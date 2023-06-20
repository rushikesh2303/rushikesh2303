#include<stdio.h>
#include<stdlib.h>
struct  queue 
{
    int size;
    int f;
    int r;
    int *arr;
};


void dequeue(struct queue *q){
    int j;
    if (q->f == q->r){
        printf("your queue is empty \n ");
    }
    else {
        q->f++;
        q->arr[q->f]=j;
        printf("the dequeue element is  %d  \n ",j);
    }
}

void enqueue( struct queue *q){
    int val;
    printf("\nEnter the element you want to insert : ");
    scanf("%d", &val);
    if(q->r == q->size-1){
        printf("your queue is full \n ");
    }
   else{
        q->r++;
        q->arr[q->r] = val;
    }
}

void display(struct queue *q){
    int i;
    for(i=q->f+1;i <= q->r;i++){
        printf("    %d" , q->arr[i]);
    }
}

int IsFull(struct queue *q){
    if(q->r == q->size-1){
        printf("your queue is full \n ");
    }
    else {
        printf("queue is not full \n");
    }
}

void IsEmpty(struct queue *q){
    if(q->f == q->r){
        printf("your queue is empty \n ");
    }
    else{
        printf("queue is not empty \n ");
    }
}


void main(){
     int a , b;
    struct queue q;
    q.size = 100;
    q.f = q.r = -1;
    q.arr = (int*)malloc(q.size*sizeof(int));

    while(1){
        printf("\n \n This is the menue for Queue operations  \n ");
        printf(" \n 1.Enque \n 2.Dequeue \n 3.IsFull \n 4.IsEmpty \n 5.Display \n 6.Exit \n ");
        printf("\n Enter Your Choice :  ");
        scanf("%d", &a);
        switch (a)
        {
            case 1: enqueue(&q);
                break ;
            case 2: dequeue(&q);
                break ;
            case 3: IsFull(&q);
                break ;
            case 4: IsEmpty(&q);
                break ;
            case 5: display(&q);
                 break ;
            case 6:
                exit(0);
        }
    }
}
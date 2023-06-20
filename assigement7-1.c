#include<stdio.h>
#include<stdlib.h>

int n,i,data;

struct node{
	int data;
	struct node * link;
}*start,*top,*temp;
void display();
void push(){
int val;
printf("\nEnter Limit of Stack :  ");
scanf("%d",&n);
i=0;
while(i<n){
printf("\nEnter Element for Push : ");
scanf("%d",&val);
if(top==NULL){
temp=malloc(sizeof(struct node));
temp->data=val;
temp->link=NULL;
top=temp;
}
else{
temp=malloc(sizeof(struct node));
temp->data=val;
temp->link=top;
top=temp;
}
i++;
}
printf("\nElement push !");
display();
}

void pop(){
struct node * p;
p=top;
top=p->link;
free(p);
}

void display(){
start=top;
printf("\nList is :   ");
while(start != NULL){
printf("  %d  ",start->data);
start=start->link;
}
}
void peek(){
printf("Peek :  %d",top->data);
}

void isEmpty(){
if(top==NULL){
printf("\nStack is Empty !");
}
else{
printf("\nStack is not Empty !");
}
}

void isFull(){
if(i==n){
printf("\nStack is Full");

}
else{
printf("\nstack is Not Full");
}
}

int main(){
int a;
while(1){
printf("\n\n-----Stack Menu-----\n");
printf("\n 1.push \n 2.pop \n 3.display \n 4.peek  \n 5.isFull \n 6.isEmpty \n 7.Exit");
printf("\nEnter Your Choice : ");
scanf("%d",&a);

if(a==1){
push();
}
else if(a==2){
pop();
}
else if(a==3){
display();
}
else if(a==4){

peek();
}
else if(a==5){
isFull();
}
else if(a==6){
isEmpty();
}
else if(a==7){
exit(0);
}
else{
printf("\nWrong Selection");
}
}
}
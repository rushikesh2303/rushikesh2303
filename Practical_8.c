#include <stdio.h>
#include <stdlib.h>
#include "btree3.h"
struct Qnode
{
    struct TreeNode *node;
    struct Qnode *next;

} * front, *rear;
void initQ()
{
    front = rear = NULL;
}
int isQEmpty()
{
    if (front == rear && rear == NULL)
    {
        printf("\n Queue Empty\n");
        return 1;
    }
    return 0;
}
void enqueue(struct TreeNode *Tnode)
{
    struct Qnode *nptr = (struct Qnode *)malloc(sizeof(struct Qnode));
    nptr->node = Tnode;
    nptr->next = NULL;
    if (rear == NULL)
    {
        front = nptr;
        rear = nptr;
    }
    else
    {
        rear->next = nptr;
        rear = rear->next;
    }
}
struct Qnode *dequeue()
{
    struct Qnode *temp;
    if (front == NULL)
    {
        printf("\n\n Queue is Empty\n");
    }
    else
    {
        temp = front;
        front = front->next;
        if (temp == rear)
        {
            rear = front;
        }
    }
    return temp;
}
void levelOrderTraversal(struct TreeNode *root)
{
    struct TreeNode *curr, *ptr;
    int total, cnt, level;
    struct Qnode *temp;
    total = cnt = level = 0;
    enqueue(root);
    ptr = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    ptr->data = 0;
    ptr->left = ptr->right = NULL;
    enqueue(ptr);
    while (front != rear)
    {
        temp = dequeue();
        if (temp->node->data != 0)
        {
            total++;
            cnt++;
            printf("%d \t", temp->node->data);
            if (temp->node->left)
                enqueue(temp->node->left);
            if (temp->node->right)
                enqueue(temp->node->right);
        }
        else
        {
            printf("\n No of nodes in level %d=%d \n", level, cnt);
            cnt = 0;
            level++;
            ptr = (struct TreeNode *)malloc(sizeof(struct TreeNode));
            ptr->data = 0;
            ptr->left = ptr->right = NULL;
            enqueue(ptr);
        }
    }
    printf("\n No of nodes in level %d=%d \n", level, cnt);
    cnt = 0;
    level++;
    printf("\n Total nodes= %d \n Number of levels= %d \n", total, level - 1);
}
int main()
{
    int val;
    struct TreeNode *root;
    root = NULL;
    initQ();
    printf("\n ###\t \t BST construction ###\n");
    while (1)
    {
        printf("\n Enter The tree node data::\t");
        scanf("%d", &val);
        if (val == 0)
            break;
        else
        {
            root = insert(root, val);
        }
    }
    printf("\n\n \t Level order Traversal\n");
    levelOrderTraversal(root);
    return 0;
}
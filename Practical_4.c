#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>
#include "setc.h"
int oddSum(struct node *temp)
{
    int sum;
    sum = 0;
    if (temp == NULL)
    {
        return 0;
    }
    else if (temp->data % 2 == 1)
    {
        sum += temp->data;
    }
    return sum + oddSum(temp->left) + oddSum(temp->right);
}
int evenSum(struct node *temp)
{
    int sum;
    sum = 0;
    if (temp == NULL)
    {
        return 0;
    }
    else if (temp->data % 2 == 0)
    {
        sum += temp->data;
    }
    return sum + evenSum(temp->left) + evenSum(temp->right);
}
struct node *mirror(struct node *root)
{
    if (root == NULL)
        return root;
    else
    {
        struct node *temp;

        /* do the subtrees */
        mirror(root->left);
        mirror(root->right);

        /* swap the pointers in this node */
        temp = root->left;
        root->left = root->right;
        root->right = temp;
    }
    return (root);
}
void main()
{
    struct node *root, *miror;
    int ch, sum, val;
    root = NULL;
    while (1)
    {
        printf("\nBST OPERATIONS ---");
        printf("\n1 - Create BST\n");
        printf("2 - Odd Sum\n");
        printf("3 - Even Sum BST\n");
        printf("4 - Mirror of BST\n");
        printf("5 - Inorder Traversal\n");
        printf("6 - Exit\n");
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            while (1)
            {
                printf("\nEnter The data : ");
                scanf("%d", &val);
                if (val == 0)
                    break;
                else
                {
                    root = create(root, val);
                }
            }
            break;
        case 2:
            sum = oddSum(root);
            printf("\n Sum of all odd numbers from BST:\t%d\n", sum);
            break;
        case 3:
            sum = evenSum(root);
            printf("\n Sum of all even numbers from BST:\t%d\n", sum);
            break;
        case 4:
            printf("\n Given Tree is \n");
            inorder(root);
            miror = mirror(root);
            printf("\n Mirror of The Given Tree is \n");
            inorder(miror);
            break;
        case 5:
            printf("\n Given Tree is \n");
            inorder(root);
            break;
        case 6:
            exit(0);
        default:
            printf("\n Wrong choice, Please enter correct choice  ");
            break;
        }
    }
}

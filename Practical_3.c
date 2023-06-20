#include <stdio.h>
#include <stdlib.h>
#include "bsecond.h"
struct node *copyBinaryTree(struct node *root)
{
    if (root == NULL)
        return NULL;
    /* create a copy of root node */
    else
    {
        struct node *newNode = (struct node *)malloc(sizeof(struct node));
        newNode->data = root->data;
        newNode->left = newNode->right = NULL;
        /* Recursively create copy of left and right sub tree */
        newNode->left = copyBinaryTree(root->left);
        newNode->right = copyBinaryTree(root->right);
        /* Return root of copy tree */
        return newNode;
    }
}
int compare(struct node *root1, struct node *root2)
{
    if (root1 == NULL && root2 == NULL)
        return 1;
    // If any one of the tree is non-empty and other is empty, return false
    else if (root1 != NULL && root2 == NULL)
        return 0;
    else if (root1 == NULL && root2 != NULL)
        return 0;
    else
    { // Check if current data of both trees equal and recursively check for left and right subtrees
        if (root1->data == root2->data && compare(root1->left, root2->left) && compare(root1->right, root2->right))
            return 1;
        else
            return 0;
    }
}
void main()
{
    struct node *root, *copy, *root1;
    int ch, count, val;
    root = NULL;
    root1 = NULL;
    while (1)
    {
        printf("\nBST OPERATIONS ---");
        printf("\n1 - Create BST\n");
        printf("2 - BST Copy\n");
        printf("3 - Compare Two BST\n");
        printf("4 - Inorder Traversal\n");
        printf("5 - Exit\n");
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
            printf("\n Original Tree\n");
            inorder(root);
            copy = copyBinaryTree(root);
            printf("\n Copy Tree\n");
            inorder(copy);
            break;
        case 3:
            printf("\n Creating 2nd BST\n");
            while (1)
            {
                printf("\n Enter The data : ");
                scanf("%d", &val);
                if (val == 0)
                    break;
                else
                {
                    root1 = create(root1, val);
                }
            }
            printf("\n 2nd BST is\n");
            inorder(root);
            if (compare(root, root1))
                printf("\n Both BSTs are identical");
            else
                printf("\n BSTs are not identical");
            break;
        case 4:
            inorder(root);
            break;
        case 5:
            exit(0);
        default:
            printf("\n Wrong choice, Please enter correct choice  ");
            break;
        }
    }
}

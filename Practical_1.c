// Menu Driven Program
#include <stdio.h>
#include <stdlib.h>
#include "btree.h"
void main()
{
    struct node *root, *temp;
    int ch, count, val;
    root = NULL;
    while (1)
    {
        printf("\n BST OPERATIONS ---");
        printf("\n 1 - Create BST\n");
        printf("2 - Insert an element into tree\n");
        printf("3 - Search an element in the tree\n");
        printf("4 - Inorder Traversal\n");
        printf("5 - Preorder Traversal\n");
        printf("6 - Postorder Traversal\n");
        printf("7 - Exit\n");
        printf("\n Enter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            while (1)
            {
                printf("\n Enter The data : ");
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
            printf("\nEnter The data to Insert\n");
            scanf("%d", &val);
            root = insert(root, val);
            break;
        case 3:
            printf("\nEnter The data to Search\n");
            scanf("%d", &val);
            temp = searchBST(root, val);
            if (temp == NULL)
                printf("\n%d is Not Found", val);
            else
                printf("\n%d is Found", val);
            break;
        case 4:
            inorder(root);
            break;
        case 5:
            preorder(root);
            break;
        case 6:
            postorder(root);
            break;
        case 7:
            exit(0);
        default:
            printf("Wrong choice, Please enter correct choice  ");
            break;
        }
    }
}

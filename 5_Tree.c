#include <stdio.h>
#include <stdlib.h>
#include "Tree.h"
int main()
{
    struct node *root, *temp;
    int ch, val, count;
    root = NULL;
    while (1)
    {
        printf("\n ---- BST OPERATION ----");
        printf("\n 1. Create BST \n ");
        printf("\n 2. Count Leaf Node \n");
        printf("\n 3. Count Non-Leaf Node \n");
        printf("\n 4. Count All Node \n");
        printf("\n 5. Exit \n ");
        printf("\n Enter Your Choice :");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            while (1)
            {
                printf("\n Enter The Data : ");
                scanf("%d", &val);
                if (val == 0)
                {
                    break;
                }
                else
                {
                    root = create(root, val);
                }
            }
            break;
        case 2:
            val = CountLeaf(root);
            printf("\n Leaf Node In The Tree Are \t%d\n", val);
            break;
        case 3:
            val = CountNonLeaf(root);
            printf("\n Non-Leaf Node In The Tree\t %d \n", val);
            break;
        case 4:
            val = CountAll(root);
            printf("\n Total Leaf Node In The Tree \t %d \n ", val);
            break;
        case 5:
            exit(0);
        default:
            printf("Wrong Choice , Please Enter Correct Choice ");
            break;
        }
    }
    return 0;
}
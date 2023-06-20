#include<stdio.h>
#include<stdlib.h>
struct Treenode
{
    struct Treenode *left;
    int data;
    struct Treenode *right;
};
int main()
{
    int n,i;
    while (1)
    {
    printf("Enter A Number : ");
    scanf("%d",&n);
    // root=Create();
    i++; 
    }
    
}
struct Treenode *Create(struct Treenode *root, int Ele)
{
    if (root==NULL)
    {
        root=(struct Treenode*)malloc(sizeof(struct Treenode));
        root->data=Ele;
        root->left=root->right=NULL;
        return (root);
    }
    else if (Ele<root->data)
    {
        root->left=Create(root->left, Ele);
    }
    else if (Ele>root->data)
    {
        root->right=Create(root->right, Ele);
    }
    else
        printf("\n Duplicate Element Not Allowed");

    return (root);
}
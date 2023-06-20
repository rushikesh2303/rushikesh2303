#include<stdio.h>
#include<malloc.h>
struct node
{
    int data;
    struct node *left, *right;
};
struct node *create(struct node *root, int ele)
{
    if (root==NULL)
    {
        root=(struct node*)malloc(sizeof(struct node));
        root->data=ele;
        root->left=NULL;
        root->right=NULL;
        return (root);
    }
    else if (ele < root->data)
    {
        root->left=create(root->left,ele);
    }
    else if (ele> root->data)
    {
        root->right=create(root->right,ele);
    }
    else
        printf("\n Duplicate Element Is Not Allowed !!!");
    return (root);
}
int CountLeaf(struct node *root)
{
    int c=0;
    if (root==NULL)
    {
        return (0);
    }
    if (root->left==NULL && root->right==NULL)
    {
        return(1);
    }
    c=CountLeaf(root->left)+CountLeaf(root->right);
    return (c);
}
int CountAll(struct node *root)
{
    int c=0;
    if (root==NULL)
    {
        return (0);
    }
    c=1+CountLeaf(root->left)+CountLeaf(root->right);
    return (c);
}
int CountNonLeaf(struct node *root)
{
    int c=0;
    if (root==NULL)
    {
        return (0);
    }
    if (root->left==NULL && root->right==NULL)
    {
        return (0);
    }
    return(1+CountLeaf(root->left)+CountLeaf(root->right));
}
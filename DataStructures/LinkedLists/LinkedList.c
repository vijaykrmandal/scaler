#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

void linkedListTraversal(struct Node *ptr){
    while(ptr!=NULL){
        printf("Element : %d \n",ptr->data);
        ptr=ptr->next;
    }
}

int main(){
    struct Node *head;
    struct Node *second;
    struct Node *third;

    head=(struct Node *) malloc(sizeof(struct Node));
    second=(struct Node *) malloc(sizeof(struct Node));
    third=(struct Node *) malloc(sizeof(struct Node));
    
    head->data=6;
    second->data=8;
    third->data=9;
    head->next=second;
    second->next=third;
    third->next=NULL;

    linkedListTraversal(head);
    getchar();
}
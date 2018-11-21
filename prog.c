#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main(){
struct node{
	int data;
    struct node *next;};
	struct node *start=NULL;
	
	void insert(int n){
		struct node *t;
		t=(struct node *)malloc(sizeof(struct node));
		t->data=n;
		t->next=NULL;
		if(start==NULL){
		start=t;}else{
			struct node *current;
			current=start;
			while(current->next!=NULL){
		current=current->next;}
		current->next=t;}
		}
	insert(10);printf("10 inserted");
	insert(20);
	printf("20 insert");insert(30);
	printf("30 inserted");
	void display(){struct node *dis;
		dis=start;
		while(dis->next !=NULL){
			printf("1st %d",dis->data);
	dis=dis->next;}printf("%d",dis->data);
	}
	display();

		
return 0;
}
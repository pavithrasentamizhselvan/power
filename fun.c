#include<stdio.h>
#include<conio.h>
int main(){
int top=0;int arr[10];
void add(int n){
	top++;arr[top]=n;
	printf("%d added",n);
}void remove(){
	int temp=arr[top];
top--;printf("%d element removed",temp);}
add(10);add(20);add(30);remove();remove();return 0;
}
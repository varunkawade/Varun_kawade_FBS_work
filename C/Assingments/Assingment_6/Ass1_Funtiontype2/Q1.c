#include<stdio.h>

int  evenOdd();
 
void main()
{
	int ret = evenOdd();
	if(ret==1)
	printf("even");
	else
	printf("odd");
}

int evenOdd()
{
	int no;
	
	printf("Enter no \n");
	scanf("%d",&no);
	
	if(no%2==0)
	return 1;
	else
	return 0;
}

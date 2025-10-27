
#include<stdio.h>
void findSum(int no);

void main()
{
	int no;
    printf("enter no \n");
	scanf("%d",&no);
	
	findSum(no);
}

void findSum(int no)
{
	int sum=0;
	
	for(int i=1; i<=no; i++)
	{
		sum= sum+i;
	}
	
	printf("The sum is %d", sum);
}
// perfect no

#include<stdio.h>

void perfectNo(int no);

void main()
{
	int no;
	printf("Enter no\n");
	scanf("%d",&no);
	
	perfectNo(no);
}

void perfectNo(int no)
{
	int sum=0, temp=no;
	
	for(int i=1; i<=no/2; i++)
	{
		if(no%i==0)
			sum=sum+i;
	}
	
	if(temp==sum)
		printf("perfect no");
	else
	    printf("not perfect");
	
}
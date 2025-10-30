
#include<stdio.h>

void strong(int* no);

void main()
{
	int no;
  	printf("Enter no:");
	scanf("%d",&no);
	strong(&no);	
}

void strong(int* no)
{
	int temp=*no, rem , sum=0, fact, n=*no;
	
	while(*no>0)
	{
		rem = *no%10;
		fact=1;
	
    	for(int i=1; i<=rem; i++)
	    {
		  fact=fact*i;
		}
    	sum=sum+fact;
    	n=*no/10;
	}
	
	if(temp==sum)
	   printf("strong");
    else
      printf("not strong");
	
	
}
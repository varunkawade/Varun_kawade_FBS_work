#include<stdio.h>

void primeNot(int* no);

void main()
{
	int no;
	printf("Enter no\n");
	scanf("%d", &no);
	primeNot(&no);
}

void primeNot(int* no)
{
	int flag=0;
	
	for(int i=2; i<=*no/2; i++)
	{
		if(*no%i==0)
		{
			flag=1;
			break;
		}
	}
	
	if(flag==1)
	printf("Not Prime");
	else
	printf("Prime");
}
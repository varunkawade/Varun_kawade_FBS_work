#include<stdio.h>
void armstrong(int no);

void main()
{
	int no;
	printf("Enter no\n");
	scanf("%d",&no);
	
	armstrong(no);
}

void armstrong(no)
{
	int sum=0, rem;
	int temp=no;
	
	for(; no>0; no=no/10)
	{
		rem = no%10;
		sum= sum+rem*rem*rem;
	}
	
	if(temp==sum)
    printf("armstrong");
	else
	printf("Not armstrong");
}
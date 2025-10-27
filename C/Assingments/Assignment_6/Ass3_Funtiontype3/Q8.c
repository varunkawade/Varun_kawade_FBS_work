
#include<stdio.h>

void sumDigits(int no);

void main()
{
	int no;
	printf("Enter number\n");
	scanf("%d",&no);
	
	sumDigits(no);
}

void sumDigits(int no)
{
	int sum , ld ;
	
	ld = no%10;
	no = no/10000;
	sum = ld+no;
	printf("%d",sum);
}
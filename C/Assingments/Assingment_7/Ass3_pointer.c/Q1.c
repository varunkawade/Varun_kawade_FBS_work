#include<stdio.h>
void armstrong(int* no);

void main()
{
	int no;
	printf("Enter no:");
	scanf("%d",&no);
	
	armstrong(&no);
}

void armstrong(int*no)
{   
    int n = *no;
	int sum=0, rem;
	int temp=*no;
	
	while (n > 0)
    {
        rem = n % 10;
        sum = sum + (rem * rem * rem);
        n = n / 10;
    }
	if(temp==sum)
    printf("armstrong");
	else
	printf("Not armstrong");

}
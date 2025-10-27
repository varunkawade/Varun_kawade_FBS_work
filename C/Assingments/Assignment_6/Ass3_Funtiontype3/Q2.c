#include<stdio.h>
void fact(int no);

void main()
{
	int no;
	printf("Enter no\n");
	scanf("%d",&no);
	
	fact(no);
}

void fact(int no)
{
	int fact =1;
	for(int i=1; i<=no; i++)
	{
		fact= fact*i;
	}
	
	printf("The fact is %d", fact);
	

}
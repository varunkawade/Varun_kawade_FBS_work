// Q1Write a program to print factors of number in given range.
// Eg. Range 10 to 15
// 10=1,2,5,10
// 11= 1,11
// 12=1, 2, 3, 4, 6, 12
// 13=1, 13
// 14 = 1, 2, 7, 14
// 15 = 1, 3, 5, 15  
#include <stdio.h>
void main()
{
	int start, end;
	printf("Enter startNo endNo\n");
	scanf("%d %d",&start,&end);
	
	for(int j=start; j<=end; j++)
	{
		   int no=j;
		   
		      printf("The factors of number %d = ", no);
		   for(int i=1; i<=no; i++)
	    	{
			  if(no%i==0)
		        printf(" %d ",i);
		    }
		    
		    printf("\n");
	
		
	}
}


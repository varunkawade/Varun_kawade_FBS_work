
#include<stdio.h>
void  pallindromeNo(int no);
 
void main()
{
    int no;
	printf("Enter no \n");
	scanf("%d", &no);
	
	pallindromeNo(no);
}

void pallindromeNo(int no)
{
	
	int rev=0 , rem ,temp=no;
	
	while(no>0)
	{
		rem =no%10;
		rev = rev*10+rem;
		no = no/10;
	}
	if(rev==temp)
	printf(" Pallindrome");
	else
	printf("Not Pallindrome");
	   	
	
}
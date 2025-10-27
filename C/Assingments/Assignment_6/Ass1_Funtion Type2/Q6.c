
#include<stdio.h>

char ulCase();

void main()
{
	if(ulCase())
	printf("Uppercase");
	else
	printf("Lowercase");
}

char ulCase()
{
	char ch;
	printf("Enter char \n");
	scanf("%c",&ch);
	
	return ch>='A' && ch<='Z';

}

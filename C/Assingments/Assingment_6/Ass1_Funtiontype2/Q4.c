#include<stdio.h>
char vowel();
 
void main()
{
	char ret = vowel();
	if(ret==1)
	printf("The char is vowel");
	else
	printf("Not vowel");
}

char vowel()
{
	char ch ;
	printf("Enter char \n");
	scanf("%c", &ch);
	
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	return 1;
	else
	return 0;
}
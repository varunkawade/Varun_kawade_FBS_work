// mystrcpy
#include<stdio.h>
#include<string.h>
char* mystrcpy(char* ptr , char* str);
int main()
{
    char str[20];
    char ptr[25];
    printf("Enter a String: ");
	gets(src);
    mystrcpy(ptr,str);
    printf("%s",ptr);

    return 0;
}
char* mystrcpy(char*ptr ,char*str)
{
    int i = 0;
    while (str[i]!=0)
    {
         ptr[i]=str[i];
         i++;
    }
    ptr[i]='\0';

  
    return ptr;
}
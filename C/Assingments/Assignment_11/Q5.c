// mystrncpy
#include<stdio.h>
#include<string.h>
char* mystrncpy(char* ptr , char* str , int n );
int main()
{
    char str[]="Varun";
    char ptr[50];
    mystrncpy(ptr,str,3);
    printf("%s",ptr);

    return 0;
}
char* mystrncpy(char*ptr ,char*str, int n)
{
    int i ;
    while (i < n )
    { 
         if(str[i]!='\0')
         ptr[i]=str[i];
         else
         ptr[i]='\0';
        i++;
    }
    ptr[i]='\0';
    
    return ptr;
}
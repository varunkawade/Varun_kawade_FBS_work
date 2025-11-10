// WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
#include<string.h>
char* replaceChar(char* str);
int main(){
     char str[20]="I am Varun";
    char* Finalstr = replaceChar(str);  
    printf("Final string = %s",Finalstr); 

}

char* replaceChar(char* str)
{
    int i = 0;
while(str[i]!='\0')
{
    if(str[i]==' ')
    {   
    str[i]='$';
    }
   i++;
}
    return str;

}
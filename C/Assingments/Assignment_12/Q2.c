// WAP Replace all Occurrences of ‘a’ with $ in a String

#include<stdio.h>
#include<string.h>
char* replaceChar(char* str);
int main(){
     char str[10]="aadesh";
    char* Finalstr = replaceChar(str);  
    printf("Final string = %s",Finalstr); 

}

char* replaceChar(char* ptr)
{
    int i = 0;
while(ptr[i]!='\0')
{
    if(ptr[i]=='a')
    {
    ptr[i]='$';
    }
   i++;
}
    return ptr;

}
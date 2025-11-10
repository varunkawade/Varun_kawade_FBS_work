// WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
#include<string.h>
char* removeoddchar(char* str , char* result);
int main(){
    char str[20];
   char result[20];
    printf("Enter the string: ");
    fgets(str,sizeof(str),stdin);
    removeoddchar(str , result);

    printf("after remove of odd char %s",result);
    return 0;
}
char* removeoddchar(char* str , char* result)
{
     int i , j = 0;
     for (i=0;str[i]!='\0'; i++)
     if(i%2==0)
     {
       result[j]=str[i];
       j++;
     }
     result[j]='\0';
     return result;
}
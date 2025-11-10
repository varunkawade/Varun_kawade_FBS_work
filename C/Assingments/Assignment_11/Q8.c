// mystrrev
#include<stdio.h>
#include<string.h>
char* mystrrev(char* str);
int main(){
    char str []="rac";
    char* result = mystrrev(str);
    printf("Reversed string: %s\n", result);
    return 0;
}
char* mystrrev(char* str)
{
 int i,j;
 char temp; 
    j = strlen(str) - 1;
      for (i = 0;  i<j; i++ , j--)
      {
    temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    return str;
}
   
   

     

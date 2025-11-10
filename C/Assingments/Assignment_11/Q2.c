// mystrlen
#include <stdio.h>
#include <string.h>
int mystrlen(char* str);
int main() {
    char str[25];
    printf("Enter a String: ");
	gets(str);

     int result = mystrlen(str);    

    
    printf("Length of string is : %d\n", length);
    return 0;
}
int mystrlen(char* str)
{
    int i = 0;
    while (str[i] !='\0')
    {
        i++;
    }
    return i;
}

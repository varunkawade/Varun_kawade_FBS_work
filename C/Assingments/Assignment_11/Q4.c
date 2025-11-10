// mystrcat
#include <stdio.h>
#include <string.h>
char* mystrcat(char* str1, char* str2);

int main() {
    char str1[20] = "Varun ";
    char str2[20] = "Kawade";

    char* res = mystrcat(str1, str2);

    printf("%s\n", res);

    return 0;
}
char* mystrcat(char *str1, char *str2)
{
    int i,j;
    for (i = 0; str1[i] != '\0'; i++);
    {
          
    }  
        for (int j = 0; str2[j] != '\0'; j++, i++)
        {
            str1[i] = str2[j];
        }
    
    
    str1[i] = '\0';

    return str1;
}
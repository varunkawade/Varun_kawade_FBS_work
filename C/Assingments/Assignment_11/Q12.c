// mystrrchr
#include <stdio.h>
#include <string.h>
char* mystrrchr(char* str, char ch);
int main()
{
    
     char str[] = "VarunKawade";
     char ch = 'd';
     char* result = mystrrchr(str, ch);

    if (result != NULL) {
        
        printf("last occurrence of '%c' found at position: %ld\n",ch, result - str);
    }
    else {
        printf("Character '%c' not found.\n", ch);
    }

    return 0;
}
char* mystrrchr(char* str, char ch){
    char* last = NULL;
    while (*str != '\0')
    {
        if (*str == ch)
        last = str;
        str++;
    
    }
    return last;
}
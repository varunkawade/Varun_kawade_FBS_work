// mystrchr

#include <stdio.h>
#include <string.h>
char* mystrchr(char* str, char ch);

int main()
{
    
     char str[] = "Varun Kawade";
     char ch = 'r';
     char* result = mystrchr(str, ch);

    if (result != NULL) {
        
        printf("Character '%c' found at position: %ld\n",
               ch, result - str);
    }
    else {
        printf("Character '%c' not found.\n", ch);
    }

    return 0;
}
char* mystrchr(char* str, char ch){
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] == ch)
        return &str[i];
         i++;
    }
}
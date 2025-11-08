// strrchr()
#include <stdio.h>
#include <string.h>

int main()
{
    
     char* str = "VarunKawade";
     char ch = 'd';
     char* result = strrchr(str, ch);

    if (result != NULL) {
        
        printf("Character '%c' found at position: %ld\n",
               ch, result - str);
    }
    else {
        printf("Character '%c' not found.\n", ch);
    }

    return 0;
}
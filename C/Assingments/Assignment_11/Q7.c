// mystrlower
#include <stdio.h>
#include <string.h>
char * mystrlower(char *str);
int main()
{
    char str[10] = "VARUN";
    char* result = mystrlower(str);
    printf("Lowercase string: %s", result);
    return 0;
}
char * mystrlower(char* str)
{   
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] >= 'A' && str[i] <= 'Z')
        {
            str[i] = str[i] + 32;
        }
        i++;
    }
    return str;
}
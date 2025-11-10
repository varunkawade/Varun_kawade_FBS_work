// mystrupper
#include <stdio.h>
#include <string.h>
char *mystrupper(char *str);
int main()
{
    char str[10] = "varun";
    char* result = mystrupper(str);
    printf("Uppercase string: %s", result);
    return 0;
}
char * mystrupper(char* str)
{
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] >= 'a' && str[i] <= 'z')
        {
            str[i] = str[i] - 32;
        }
        i++;
    }
    return str;
}
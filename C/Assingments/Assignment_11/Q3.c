// mystrcmp
#include <stdio.h>
#include <string.h>
int mystrcmp(char *str1, char * str2);
int main()
{
    char arr[25];
    char brr[25];
    printf("Enter a String: ");
	gets(str1);

    printf("Enter a String: ");
	gets(str2);
    int result = mystrcmp(str1, str2);
    if (result == 0)
        printf("Strings are equal\n");
    else if (result < 0)
        printf("First string is smaller\n");
    else
        printf("First string is greater\n");

    return 0;
}
int mystrcmp(char* str1, char* str2)
{
    int i;
    for (i = 0; str1[i] != '\0' && str2[i] != '\0'; i++)
    {
        if (str1[i] != str2[i])
            return str1[i] - str2[i];
    }
    return str1[i] - str2[i];
}

// mystrncmp

#include <stdio.h>
#include <string.h>
int mystrncmp(char *str1, char *str2,int n);
int main()
{
    char str1[25];
    char str2[25];
    int n;
    printf("Enter a String 1: ");
    gets(str1);

    printf("Enter a String 2: ");
    gets(str2);
    printf("Enter number of characters to compare: ");
    scanf("%d", &n);

    int result = mystrncmp(str1, str2, n);
    if (result == 0)
        printf("Strings are equal\n");
    else if (result < 0)
        printf("First string is smaller\n");
    else
        printf("First string is greater\n");

    return 0;
}
int mystrncmp(char *str1, char *str2,int n)
{
    int i;
    for (i = 0; i < n && str1[i] != '\0' && str2[i] != '\0'; i++)
    {
        if (str1[i] != str2[i])
            return str1[i] - str2[i];
    }
    return str1[i] - str2[i];
}
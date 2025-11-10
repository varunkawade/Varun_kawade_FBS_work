// mystrstr
#include <stdio.h>
#include<string.h>

char* mystrstr(char* str, char* sub);

int main() {
    char str[] = "C programming is fun";
    char *p = mystrstr(str, "programming");

    if (p != NULL)
        printf("Substring found: %s\n", p);
    else
        printf("Substring not found\n");

    return 0;
}

char* mystrstr(char* str, char* sub)
{
    int i, j, k;
    for (i = 0; str[i] != '\0'; i++)
    {
        for (j = 0, k = i; sub[j] != '\0' && str[k] == sub[j]; j++, k++);

        if (sub[j] == '\0')
            return &str[i];
    }
      return str;
}

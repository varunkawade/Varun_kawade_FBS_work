// mystrnstr
#include <stdio.h>
#include <string.h>

char* mystrnstr(char* str, char* sub, int n);

int main() {
    char str[] = "C programming is fun";
    char *p = mystrnstr(str, "programming", 20); 

    if (p != NULL)
        printf("Substring found: %s\n", p);
    else
        printf("Substring not found\n");

    return 0;
}

char* mystrnstr(char* str, char* sub, int n)
{
    int i, j, k;
    int len_sub = strlen(sub);

    if (len_sub == 0) 
        return str;

    for (i = 0; i <= n - len_sub && str[i] != '\0'; i++)
    {
        for (j = 0, k = i; sub[j] != '\0' && str[k] == sub[j]; j++, k++);

        if (sub[j] == '\0')
            return &str[i]; 
    }
    return NULL;
}

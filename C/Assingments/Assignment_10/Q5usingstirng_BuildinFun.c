// strncat()
#include <stdio.h>
#include <string.h>

int main() {
    char str1[20];
    char dest[20];
    strcpy(str1,"Kawade");

    strcpy(dest,"Varun");

    strncat(dest, str1,sizeof(dest) - strlen(dest) - 1);

    printf(" %s\n",  dest);
    return 0;
}
// strcat()
#include <stdio.h>
#include <string.h>

int main() {
    char str1[20] = "Varun ";
    char str2[] = "Kawade";
    strcat(str1, str2);
    printf(" %s\n", str1);
    return 0;
}

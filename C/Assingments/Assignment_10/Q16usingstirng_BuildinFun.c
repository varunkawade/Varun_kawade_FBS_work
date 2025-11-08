// memmove()
#include <stdio.h>
#include <string.h>

int main() {
    char str[20] = "abcdef";
    memmove(str + 2, str, 4);
    printf("After memmove = %s\n", str);
    return 0;
}

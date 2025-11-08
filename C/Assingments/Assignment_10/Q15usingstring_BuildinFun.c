// memcpy()

#include <stdio.h>
#include <string.h>

int main() {
    char src[] = "this should be copy";
    char dest[20];
    memcpy(dest, src, strlen(src) + 1);
    printf("Copied string = %s\n", dest);
    return 0;
}

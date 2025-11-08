// strpbrk()
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "HelloWorld";
    char *p = strpbrk(str, "xyzlo");
    printf("First matching character found: %s\n", p);
    return 0;
}

// strstr()
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "C programming is fun";
    char *p = strstr(str, "programming");
    printf("Substring found: %s\n", p);
    return 0;
}

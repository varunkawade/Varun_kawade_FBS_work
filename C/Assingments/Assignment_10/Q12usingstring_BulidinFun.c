// cspnstr()
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "abc123";
    printf("Chars before digit = %zu\n", strcspn(str, "123"));
    return 0;
}

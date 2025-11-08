// strspn()
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "abc123";
    printf("Length of initial abc chars = %zu\n", strspn(str, "abc"));
    return 0;
}

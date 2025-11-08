// strcoll()

#include <stdio.h>
#include <string.h>

int main() {
    char a[] = "apple";
    char b[] = "banana";
    printf("strcoll result = %d\n", strcoll(a, b));
    return 0;
}

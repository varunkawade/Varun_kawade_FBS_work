// Q2 Write a program to find power of any number.
// Eg. 2^4 = 16

#include <stdio.h>

int main() {
    int base, power;
    int i, result = 1;

    printf("Enter base number: ");
    scanf("%d", &base);

    printf("Enter power: ");
    scanf("%d", &power);

    for (i = 1; i <= power; i++) {
        result = result * base;
    }

    printf("%d^%d = %d", base, power, result);

    return 0;
}

#include <stdio.h>

void checkEvenOdd(int *ptr);

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    checkEvenOdd(&num);
    return 0;
}

void checkEvenOdd(int *ptr) {
    if (*ptr % 2 == 0)
        printf("%d is an Even number\n", *ptr);
    else
        printf("%d is an Odd number\n", *ptr);
}

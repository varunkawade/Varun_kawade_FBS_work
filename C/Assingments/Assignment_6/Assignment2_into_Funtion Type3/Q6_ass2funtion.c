#include <stdio.h>

void checkDivisibility(int num);

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    checkDivisibility(num);

    return 0;
}

void checkDivisibility(int num) {
    if (num % 3 == 0 && num % 5 == 0)
        printf("Divisible by both 3 and 5\n");
    else if (num % 3 == 0)
        printf("Divisible by 3 but not by 5\n");
    else if (num % 5 == 0)
        printf("Divisible by 5 but not by 3\n");
    else
        printf("Divisible by None\n");
}

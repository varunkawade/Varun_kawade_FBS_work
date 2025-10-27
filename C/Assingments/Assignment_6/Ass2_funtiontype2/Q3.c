#include <stdio.h>

int findGreatest();

void main() {
    int greatest = findGreatest();
    printf("The greatest number is %d\n", greatest);
}

int findGreatest() {
    int a, b, c;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}

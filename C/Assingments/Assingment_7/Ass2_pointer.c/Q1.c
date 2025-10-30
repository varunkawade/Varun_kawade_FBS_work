#include <stdio.h>

void number(int *x, int *y, int *ch);

int main() {
    int a, b, ch;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    printf("Enter your choice:\n");
    printf("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulus\n");
    scanf("%d", &ch);

    number(&a, &b, &ch);   
    return 0;
}

void number(int *x, int *y, int *ch) {
    int a = *x, b = *y, c = *ch;  

    if (c == 1)
        printf("Addition of %d and %d is: %d\n", a, b, a + b);
    else if (c == 2)
        printf("Subtraction of %d and %d is: %d\n", a, b, a - b);
    else if (c == 3)
        printf("Division of %d and %d is: %d\n", a, b, a / b);
    else if (c == 4)
        printf("Multiplication of %d and %d is: %d\n", a, b, a * b);
    else if (c == 5)
        printf("Modulus of %d and %d is: %d\n", a, b, a % b);
    else
        printf("Invalid choice\n");
}

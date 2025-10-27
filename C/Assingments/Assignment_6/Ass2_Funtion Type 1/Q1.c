#include <stdio.h>

void number();

void main() {
    number();
}

void number() {
    int a, b, ch;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    printf("Enter choice (1.Add 2.Sub 3.Div 4.Mul 5.Mod): ");
    scanf("%d", &ch);

    if (ch == 1)
        printf("Addition = %d\n", a + b);
    else if (ch == 2)
        printf("Subtraction = %d\n", a - b);
    else if (ch == 3)
        printf("Division = %d\n", a / b);
    else if (ch == 4)
        printf("Multiplication = %d\n", a * b);
    else if (ch == 5)
        printf("Modulus = %d\n", a % b);
    else
        printf("Invalid choice\n");
}

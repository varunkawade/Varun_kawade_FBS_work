#include <stdio.h>
void number(int a, int b, int ch);

int main() {
    int a, b;
    int ch = 5; 

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);  

   
    number(a, b, ch);

    return 0;
}

void number(int a, int b, int ch) {
    if (ch == 1)
        printf("Addition of %d and %d is: %d\n", a, b, a + b);
    else if (ch == 2)
        printf("Subtraction of %d and %d is: %d\n", a, b, a - b);
    else if (ch == 3)
        printf("Division of %d and %d is: %d\n", a, b, a / b);
    else if (ch == 4)
        printf("Multiplication of %d and %d is: %d\n", a, b, a * b);
    else if (ch == 5)
        printf("Modulus of %d and %d is: %d\n", a, b, a % b);
    else
        printf("Invalid choice\n");
}

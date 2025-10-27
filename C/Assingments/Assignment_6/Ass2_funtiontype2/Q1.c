#include <stdio.h>

int number();

int main() {
    int result = number();
    printf("Result = %d\n", result);
    return 0;
}

int number() {
    int a, b, ch;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    printf("Enter choice (1.Add 2.Sub 3.Div 4.Mul 5.Mod): ");
    scanf("%d", &ch);

    if (ch == 1)
        return a + b;
    else if (ch == 2)
        return a - b;
    else if (ch == 3)
        return a / b;
    else if (ch == 4)
        return a * b;
    else if (ch == 5)
        return a % b;
    else
        return 0;
}

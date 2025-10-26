// Write a C program to add two integers and display the result using Function


#include <stdio.h>
int addTwoIntegers(int a, int b) {
    return a + b;
}
int main() {
    int a, b, sum;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    sum = addTwoIntegers(a, b);

    printf("The sum of %d and %d is %d\n", a, b, sum);

    return 0;
}

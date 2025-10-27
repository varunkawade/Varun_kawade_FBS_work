#include <stdio.h>

int addTwoIntegers(); 

void main() {
    int sum = addTwoIntegers();  
    printf("The sum is %d\n", sum);
}

int addTwoIntegers() {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    return a + b;
}

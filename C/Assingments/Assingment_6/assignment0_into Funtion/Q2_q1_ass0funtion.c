#include <stdio.h>
int addNumbers(); 

int main() {
    int result;
    result = addNumbers(); 
    printf("The sum is: %d\n", result);
    return 0;
}

int addNumbers() {
    int a, b;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);

    return a + b; 
}

#include <stdio.h>

int a, b; 

void swap();  

int main() {
    printf("Enter the value of a and b: ");
    scanf("%d %d", &a, &b);

    swap(); 

    printf("After swap:\n");
    printf("a = %d, b = %d\n", a, b);

    return 0;
}

void swap() {    
    int temp;
    temp = a;
    a = b;
    b = temp;
}

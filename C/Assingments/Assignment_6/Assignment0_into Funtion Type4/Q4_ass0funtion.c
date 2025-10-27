#include <stdio.h>
void swap(int *x, int *y);  

int main() {
    int a, b;

    printf("Enter the value of a and b: ");
    scanf("%d %d", &a, &b);

    swap(&a, &b);   

    printf("After swap:\n");
    printf("a = %d, b = %d\n", a, b);

    return 0;
}

void swap(int *x, int *y) {
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

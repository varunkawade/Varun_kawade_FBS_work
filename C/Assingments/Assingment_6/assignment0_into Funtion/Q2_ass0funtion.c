// Write a C program to find the area of a circle.


#include <stdio.h>

int main() {
    int r;
    float pi = 3.14;
    float area;
    printf("Enter the radius of the circle: ");
    scanf("%d", &r);
    area = pi * r * r;
    printf("Area of the circle = %.2f\n", area);

    return 0;
}

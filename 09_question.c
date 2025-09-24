// Write a C program to input the base and height of a triangle and calculate its area.
#include <stdio.h>
#define PI 3.14

int main() {
    int radius = 4;
    float surfaceArea;

    surfaceArea = 4 * PI * radius * radius;

    printf("Total Surface Area of Sphere = %.2f\n", surfaceArea);

    return 0;
}
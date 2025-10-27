#include<stdio.h>
#define PI 3.14

float surfaceAreaOfSphere(int radius); 

void main()
{
    int radius;
    float surfaceArea;

    printf("Enter the radius: ");
    scanf("%d", &radius);

    surfaceArea = surfaceAreaOfSphere(radius);

    printf("Total Surface Area of Sphere = %.2f\n", surfaceArea);
}

float surfaceAreaOfSphere(int radius)
{
    float surfaceArea = 4 * PI * radius * radius;
    return surfaceArea;   
}

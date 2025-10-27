#include <stdio.h>

float area(float r);   

void main()
{
    float r, a;

    printf("Enter the radius of the circle: ");
    scanf("%f", &r);

    a = area(r);   

    printf("Area of the circle = %.2f\n", a);
}

float area(float r) 
{
    float pi = 3.14;
    float area = pi * r * r;
    return area;  
}

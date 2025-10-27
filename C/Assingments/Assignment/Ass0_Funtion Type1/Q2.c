#include<stdio.h>

void area();  

void main()
{
    area();   
}

void area()    
{
    int r;
    float pi = 3.14, a;

    printf("Enter the radius of the circle: ");
    scanf("%d", &r);

    a = pi * r * r;

    printf("Area of the circle = %.2f\n", a);
}

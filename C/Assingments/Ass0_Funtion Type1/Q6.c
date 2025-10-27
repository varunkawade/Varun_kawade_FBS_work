#include<stdio.h>

void squareCube();  

void main()
{
    squareCube();    
}

void squareCube()    
{
    int a, square, cube;

    printf("Enter a number: ");
    scanf("%d", &a);

    square = a * a;
    cube = a * a * a;

    printf("Number: %d\n", a);
    printf("Square: %d\n", square);
    printf("Cube: %d\n", cube);
}

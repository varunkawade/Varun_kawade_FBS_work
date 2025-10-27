#include<stdio.h>

int squareCube(int a);

void main()
{
    int a, cube;

    printf("Enter a number: ");
    scanf("%d", &a);

    cube = squareCube(a);  

    printf("Cube returned from function: %d\n", cube);
}
int squareCube(int a)
{
    int square = a * a;
    int cube = a * a * a;

    printf("Number: %d\n", a);
    printf("Square: %d\n", square);

    return cube;  
}

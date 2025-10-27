#include<stdio.h>

void perimeterRectangle();   

void main()
{
    perimeterRectangle();   
}

void perimeterRectangle()
{
    int length, width, perimeter;

    printf("Enter the length and width: ");
    scanf("%d %d", &length, &width);

    perimeter = 2 * (length + width);

    printf("Perimeter of rectangle = %d\n", perimeter);
}

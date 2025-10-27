#include<stdio.h>

int perimeterRectangle(int length, int width); 

void main()
{
    int length, width, perimeter;

    printf("Enter the length and width: ");
    scanf("%d %d", &length, &width);

    perimeter = perimeterRectangle(length, width);   

    printf("Perimeter of rectangle = %d\n", perimeter);
}

int perimeterRectangle(int length, int width)
{
    int perimeter = 2 * (length + width);
    return perimeter;    
}

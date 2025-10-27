#include <stdio.h>

int checkTriangle();

void main() {
    int result = checkTriangle();

    if (result == 1)
        printf("Equilateral Triangle\n");
    else if (result == 2)
        printf("Isosceles Triangle\n");
    else
        printf("Scalene Triangle\n");
}

int checkTriangle() {
    int side1, side2, side3;

    printf("Enter three sides of the triangle: ");
    scanf("%d %d %d", &side1, &side2, &side3);

    if (side1 == side2 && side2 == side3)
        return 1;
    else if (side1 == side2 || side1 == side3 || side2 == side3)
        return 2;
    else
        return 3;
}

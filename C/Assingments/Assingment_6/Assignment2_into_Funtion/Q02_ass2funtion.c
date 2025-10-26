#include <stdio.h>


void checkTriangle(int side1, int side2, int side3);

int main() {
    int side1, side2, side3;


    printf("Enter three sides of the triangle: ");
    scanf("%d %d %d", &side1, &side2, &side3);

   
    checkTriangle(side1, side2, side3);

    return 0;
}


void checkTriangle(int side1, int side2, int side3) {
    if (side1 == side2 && side2 == side3)
        printf("The triangle is Equilateral\n");
    else if (side1 == side2 || side1 == side3 || side2 == side3)
        printf("The triangle is Isosceles\n");
    else
        printf("The triangle is Scalene\n");
}

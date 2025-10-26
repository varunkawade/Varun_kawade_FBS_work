#include<stdio.h>
#define PI 3.14

int main(){
     int radius;
    float surfaceArea;
  printf("Enter the radius:");
    scanf("%d", &radius);
    surfaceArea = 4 * PI * radius * radius;

    printf("Total Surface Area of Sphere = %.2f\n", surfaceArea);

    return 0;
}
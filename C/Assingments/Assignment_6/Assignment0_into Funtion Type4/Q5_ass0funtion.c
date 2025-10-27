#include<stdio.h>
float average(int a, int b, int c, int d, int e);

void main()
{
    int a, b, c, d, e;
    float avg;

    printf("Enter five values: ");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);

    avg = average(a, b, c, d, e);  

    printf("Average = %.2f\n", avg);
}

float average(int a, int b, int c, int d, int e)
{
    float sum = a + b + c + d + e;
    float avg = sum / 5;
    return avg;   
}

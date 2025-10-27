#include<stdio.h>

void average();   

void main()
{
    average();    
}

void average()    
{
    int a, b, c, d, e;
    float sum, avg;

    printf("Enter five values: ");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);

    sum = a + b + c + d + e;
    avg = sum / 5;

    printf("Average = %.2f\n", avg);
}

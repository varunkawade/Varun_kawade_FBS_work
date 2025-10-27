#include<stdio.h>

void convert();   

void main()
{
    convert();    
}

void convert()    
{
    float c, f;
    printf("Enter the Celsius temperature: ");
    scanf("%f", &c);

    f = (9.0 / 5.0) * c + 32;
    printf("The value in Fahrenheit is %.2f\n", f);
}

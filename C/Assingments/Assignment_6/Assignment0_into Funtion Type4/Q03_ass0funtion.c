#include <stdio.h>
float convert(float c);

void main()
{
    float c, f;

    printf("Enter the Celsius temperature: ");
    scanf("%f", &c);

    f = convert(c); 

    printf("The value in Fahrenheit is %.2f\n", f);
}


float convert(float c)
{
    float f;
    f = (9.0 / 5.0) * c + 32;
    return f;  
}

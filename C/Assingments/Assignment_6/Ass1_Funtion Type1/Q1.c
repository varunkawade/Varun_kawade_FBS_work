#include <stdio.h>

void checkEvenOdd();

void main()
{
    checkEvenOdd();    
}

void checkEvenOdd()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num % 2 == 0)
        printf("%d is an Even number\n", num);
    else
        printf("%d is an Odd number\n", num);
}

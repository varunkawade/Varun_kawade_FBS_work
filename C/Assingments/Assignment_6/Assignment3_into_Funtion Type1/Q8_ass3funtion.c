#include<stdio.h>

void sumDigits();   

void main()
{
    sumDigits();  
}

void sumDigits()    
{
    int no, first, last, sum;

    printf("Enter number: ");
    scanf("%d", &no);

    last = no % 10;           

    while(no >= 10)          
    {
        no = no / 10;
    }
    first = no;

    sum = first + last;

    printf("Sum of first and last digit = %d", sum);
}
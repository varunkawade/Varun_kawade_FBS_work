#include<stdio.h>

void fact();   

void main()
{
    fact();    
}

void fact()   
{
    int no, fact = 1;

    printf("Enter number: ");
    scanf("%d", &no);

    for(int i = 1; i <= no; i++)
    {
        fact = fact * i;
    }

    printf("The factorial is %d", fact);
}

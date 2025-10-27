#include<stdio.h>

void add(); 

void main()
{
    add();    
}

void add()   
{
    int a, b, c;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);  

    c = a + b;

    printf("The sum of %d and %d is %d", a, b, c);
}

#include<stdio.h>

void armstrong();   // function declaration

void main()
{
    armstrong();    // function call
}

void armstrong()    // function definition
{
    int no, sum = 0, rem, temp;

    printf("Enter number: ");
    scanf("%d", &no);

    temp = no;

    for(; no > 0; no = no / 10)
    {
        rem = no % 10;
        sum = sum + rem * rem * rem;
    }

    if(temp == sum)
        printf("Armstrong number");
    else
        printf("Not Armstrong number");
}

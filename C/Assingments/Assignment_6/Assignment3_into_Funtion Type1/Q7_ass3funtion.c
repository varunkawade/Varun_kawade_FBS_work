#include<stdio.h>

void strong();   

void main()
{
    strong();    
}

void strong()  
{
    int no, temp, rem, sum = 0, fact;

    printf("Enter number: ");
    scanf("%d", &no);

    temp = no;

    while(no > 0)
    {
        rem = no % 10;
        fact = 1;

        for(int i = 1; i <= rem; i++)
        {
            fact = fact * i;
        }

        sum = sum + fact;
        no = no / 10;
    }

    if(temp == sum)
        printf("Strong number");
    else
        printf("Not strong number");
}
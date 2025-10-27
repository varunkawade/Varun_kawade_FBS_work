#include<stdio.h>

void primeNot();  

void main()
{
    primeNot();    
}

void primeNot()    
{
    int no, flag = 0;

    printf("Enter number: ");
    scanf("%d", &no);

    for(int i = 2; i <= no / 2; i++)
    {
        if(no % i == 0)
        {
            flag = 1;
            break;
        }
    }

    if(flag == 1)
        printf("Not Prime");
    else
        printf("Prime");
}


#include<stdio.h>

void perfectNo();   

void main()
{
    perfectNo();   
}

void perfectNo()   
{
    int no, sum = 0, temp;

    printf("Enter number: ");
    scanf("%d", &no);

    temp = no;

    for(int i = 1; i <= no / 2; i++)
    {
        if(no % i == 0)
            sum = sum + i;
    }

    if(temp == sum)
        printf("Perfect number");
    else
        printf("Not perfect");
}

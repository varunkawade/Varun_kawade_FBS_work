// Check the given number is Strong number or not.
// Input: n = 145
// Output: Strong

#include <stdio.h>

int main()
{
    int no = 145, temp = no, sum = 0;

    while (no > 0)
    {
        int rem = no % 10;
        int fact = 1;
        int i = 1;

        while (i <= rem)
        {
            fact = fact * i;
            i++;
        }

        sum = sum + fact; 
        no = no / 10;      
    }

    if (temp == sum)
    {
        printf("%d is Strong number", temp);
    }
    else
    {
        printf("%d is Not Strong number", temp);
    }

    return 0;
}

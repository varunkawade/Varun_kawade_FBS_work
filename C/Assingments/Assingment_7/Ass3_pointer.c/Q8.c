#include <stdio.h>

int sumDigits(int *no);

int main()
{
    int no;
    printf("Enter number: ");
    scanf("%d", &no);

    int temp = no;
    int sum = sumDigits(&no);

    printf("Sum of digits of %d is %d\n", temp, sum);
    return 0;
}

int sumDigits(int *no)
{
    if (*no == 0)
        return 0;

    int rem = *no % 10;
    int temp = *no / 10; 

    return rem + sumDigits(&temp);
}

// Check the given number is Palindrome number or not.
// Input: n = 121
// Output: Palindrome

#include <stdio.h>

int main()
{

    int no = 121, rem, temp = no, rev = 0;

    while (no > 0)

    {

        rem = no % 10;

        rev = rev * 10 + rem;

        no = no / 10;
    }

    if (rev == temp)

    {

        printf("%d is Palindrome", temp);
    }

    else

    {

        printf("%d Not Palindrome", temp);
    }
}
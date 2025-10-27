#include <stdio.h>

void checkPalindrome();  

void main()
{
    checkPalindrome();    
}

void checkPalindrome()
{
    int no, firstDigit, lastDigit;

    printf("Enter a 3-digit number: ");
    scanf("%d", &no);

    if (no < 100 || no > 999) {
        printf("Please enter a 3-digit number only.\n");
        return;
    }

    firstDigit = no / 100;     
    lastDigit = no % 10;     

    if (firstDigit == lastDigit)
        printf("%d is a palindrome number\n", no);
    else
        printf("%d is not a palindrome number\n", no);
}

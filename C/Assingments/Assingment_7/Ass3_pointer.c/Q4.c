#include <stdio.h>

void palindromeNo(int* no);

int main()
{
    int no;
    printf("Enter number:");
    scanf("%d", &no);      

    palindromeNo(&no);     

    return 0;
}

void palindromeNo(int* no)
{
    int rev = 0, rem;
    int temp = *no; 
    int n = *no;    

    while (n > 0)    
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }

    if (rev == temp)
        printf("%d is Palindrome\n", *no);
    else
        printf("%d is Not Palindrome\n", *no);
}

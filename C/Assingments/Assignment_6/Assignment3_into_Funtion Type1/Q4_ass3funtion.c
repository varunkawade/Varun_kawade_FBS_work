
#include<stdio.h>

void pallindromeNo();   

void main()
{
    pallindromeNo();    
}

void pallindromeNo() 
{
    int no, rev = 0, rem, temp;

    printf("Enter number: ");
    scanf("%d", &no);

    temp = no;

    while(no > 0)
    {
        rem = no % 10;
        rev = rev * 10 + rem;
        no = no / 10;
    }

    if(rev == temp)
        printf("Palindrome");
    else
        printf("Not Palindrome");
}

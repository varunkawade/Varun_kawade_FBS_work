#include<stdio.h>

void checkEligibility();   

void main()
{
    checkEligibility();    
}

void checkEligibility()
{
    int age;

    printf("Enter your age: ");
    scanf("%d", &age);

    if(age >= 18)
        printf("Eligible for vote\n");
    else
        printf("Not Eligible for vote\n");
}

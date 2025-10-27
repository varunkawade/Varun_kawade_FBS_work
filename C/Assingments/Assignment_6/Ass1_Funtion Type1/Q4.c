#include<stdio.h>

void checkVowelOrConsonant(); 

void main()
{
    checkVowelOrConsonant();   
}

void checkVowelOrConsonant()
{
    char ch;

    printf("Enter any character: ");
    scanf(" %c", &ch);   

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
       ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        printf("%c is a vowel\n", ch);
    else
        printf("%c is a consonant\n", ch);
}

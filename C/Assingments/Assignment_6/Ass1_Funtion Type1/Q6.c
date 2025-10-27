#include<stdio.h>

void CheckCase();  

void main() {
    CheckCase();
}

void CheckCase() {
    char ch;
    printf("Enter any character: ");
    scanf(" %c", &ch);  

    if (ch >= 'A' && ch <= 'Z')
        printf("%c is Uppercase\n", ch);
    else if (ch >= 'a' && ch <= 'z')
        printf("%c is Lowercase\n", ch);
    else
        printf("%c is not an alphabet character\n", ch);
}

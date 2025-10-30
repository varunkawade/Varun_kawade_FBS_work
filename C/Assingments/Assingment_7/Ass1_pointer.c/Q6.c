#include<stdio.h>

void CheckCase(char* ptr);

int main() {
    char ch;
    printf("Enter any character: ");
    scanf(" %c", &ch);  

    CheckCase(& ch);
    return 0;
}

void CheckCase(char* ptr) {
    char ch = *ptr;  
    if (ch >= 'A' && ch <= 'Z')
        printf("%c is Uppercase\n", ch);
    else if (ch >= 'a' && ch <= 'z')
        printf("%c is Lowercase\n", ch);
    else
        printf("%c is not an alphabet character\n", ch);
}

#include <stdio.h>

void checkVowelOrConsonant(char *ptr);

int main() {
    char ch;
    printf("Enter any character: ");
    scanf("%c", &ch);

    checkVowelOrConsonant(&ch);  
    return 0;
}

void checkVowelOrConsonant(char *ptr) {
    char ch = *ptr;  

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        printf("%c is a vowel\n", ch);
    else
        printf("%c is a consonant\n", ch);
}

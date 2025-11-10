// WAP to Calculate the Number of Words Present in a String
#include <stdio.h>
#include <string.h>

int countWords(char *str);

int main() {
    char str[200];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);   

    int words = countWords(str);
    printf("Number of words = %d\n", words);

    return 0;
}

int countWords(char *str) {
    int i, count = 0;

    for (i = 0; str[i] != '\0'; i++) {
        
        if ((i == 0 && str[i] != ' ') ||
            (str[i] != ' ' && str[i - 1] == ' ')) {
            count++;
        }
    }
    return count;
}

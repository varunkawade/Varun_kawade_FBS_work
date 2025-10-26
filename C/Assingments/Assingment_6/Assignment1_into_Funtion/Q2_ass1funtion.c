#include <stdio.h>
void checkPalindrome(int no);

int main() {
    int no;

    printf("Enter a 3-digit number: ");
    scanf("%d", &no);
    checkPalindrome(no);

    return 0;
}
void checkPalindrome(int no) {
    int firstDigit, lastDigit;
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

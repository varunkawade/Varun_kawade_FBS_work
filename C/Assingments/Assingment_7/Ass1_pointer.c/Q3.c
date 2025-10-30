#include <stdio.h>

void checkLeapYear(int *ptr);

int main() {
    int year;

    printf("Enter the year: ");
    scanf("%d", &year);

    checkLeapYear(&year);
    return 0;
}

void checkLeapYear(int *ptr) {
    int year = *ptr;  

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        printf("%d is a Leap year\n", year);
    else
        printf("%d is not a Leap year\n", year);
}

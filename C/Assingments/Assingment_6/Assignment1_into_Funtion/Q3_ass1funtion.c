#include <stdio.h>

void checkLeapYear(int year);

int main() {
    int year;

    printf("Enter the year: "); 
    scanf("%d", &year);
    checkLeapYear(year);

    return 0;
}
void checkLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        printf("%d is a Leap year\n", year);
    else
        printf("%d is not a Leap year\n", year);
}

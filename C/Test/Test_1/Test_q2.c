// WAP to check if the year is leap or not.

#include <stdio.h>

int main() {

int year = 2024; // hardcoded value

if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))

printf("%d is a Leap Year\n", year);

else

printf("%d is NOT a Leap Year\n", year);

return 0;


}

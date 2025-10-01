// Write a C program to convert given minutes into hours and remaining minutes.
#include <stdio.h>

int main() {
    int minutes = 130;
    int hours, remaining_minutes;

    hours = minutes / 60;
    remaining_minutes = minutes % 60;

    printf("%d minutes is %d hour(s) and %d minute(s)\n", minutes, hours, remaining_minutes);

    return 0;
}
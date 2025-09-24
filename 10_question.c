// Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.
#include <stdio.h>

int main() {
    int s1 = 80, s2 = 75, s3 = 85, s4 = 90, s5 = 88;
    int total;
    float percentage;

    total = s1 + s2 + s3 + s4 + s5;
    percentage = (total / 5.0);

    printf("Total Marks = %d\n", total);
    printf("Percentage = %.2f\n", percentage);

    return 0;
}
#include<stdio.h>

float calculatePercentage(int s1, int s2, int s3, int s4, int s5);   

void main()
{
    int s1, s2, s3, s4, s5;
    float percentage;

    printf("Enter the 5 subject marks: ");
    scanf("%d %d %d %d %d", &s1, &s2, &s3, &s4, &s5);

    percentage = calculatePercentage(s1, s2, s3, s4, s5); 

    printf("Percentage = %.2f\n", percentage);
}

float calculatePercentage(int s1, int s2, int s3, int s4, int s5)
{
    int total = s1 + s2 + s3 + s4 + s5;
    float percentage = total / 5.0;

    return percentage;   
}

#include<stdio.h>

void convertTime(); 

void main()
{
    convertTime(); 
}

void convertTime()   
{
    int minutes, hours, remaining_minutes;

    printf("Enter the Minutes: ");
    scanf("%d", &minutes);

    hours = minutes / 60;
    remaining_minutes = minutes % 60;

    printf("%d minutes is %d hour(s) and %d minute(s)\n", minutes, hours, remaining_minutes);
}

#include<stdio.h>

int convertTime(int minutes); 

void main()
{
    int minutes, remaining_minutes;

    printf("Enter the Minutes: ");
    scanf("%d", &minutes);

    remaining_minutes = convertTime(minutes);   

    printf("Remaining minutes (after full hours): %d\n", remaining_minutes);
}

int convertTime(int minutes)    
{
    int hours = minutes / 60;
    int remaining = minutes % 60;

    printf("%d minutes is %d hour(s) and %d minute(s)\n", minutes, hours, remaining);

    return remaining;  
}

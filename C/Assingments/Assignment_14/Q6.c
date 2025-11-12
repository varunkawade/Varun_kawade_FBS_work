// Date (date, month, year)
#include<stdio.h>
#include<string.h>
struct Date
{
    int date;
    int month;
    int year;

};
int main()
{
    struct Date d1 ,d2;
    d1.date=11;
    d1.month=11;
    d1.year=2011;


    printf("Enter date:");
    scanf("%d",&d2.date);
    printf("Enter month:");
    scanf("%d",&d2.month);
    printf("Enter year:");
    scanf("%d",&d2.year);

    printf("\nDate d1\n");
    printf("Date=%d\n",d1.date);
    printf("month=%d\n",d1.month);
    printf("year=%d\n",d1.year);

    printf("\nDate d2\n");
    printf("Date=%d\n",d2.date);
    printf("month=%d\n",d2.month);
    printf("year=%d\n",d2.year);

}
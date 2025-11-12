// SalesManager (id, name, salary, incentive, target)
#include <stdio.h>
#include <string.h>
struct SalesManager
{
    int id;
    char name[20];
    int salary;
    int incetive;
    int target;
};
int main()
{
    struct SalesManager s1, s2;
    s1.id = 001;
    strcpy(s1.name ,"Ariya");
    s1.salary = 10000;
    s1.incetive = 500;
    s1.target = 100;

    printf("Enter Id of 2 SalesManager:");
    scanf("%d", &s2.id);

    printf("Enter Name of 2 SalesManager:");
    scanf("%s", s2.name);

    printf("Enter salary of 2 SalesManager:");
    scanf("%d", &s2.salary);

    printf("Enter incetive of 2 SalesManager:");
    scanf("%d", &s2.incetive);

    printf("Enter targetof 2 SalesManager:");
    scanf("%d", &s2.target);

    printf("\nDetails of 1 SalesManager\n");
    printf("Id=%d\n", s1.id);
    printf("Name=%s\n", s1.name);
    printf("Salary=%d\n", s1.salary);
    printf("Incetive=%d\n", s1.incetive);
    printf("Target=%d\n", s1.target);

    printf("\nDetails of 2 SalesManager\n");
    printf("Id=%d\n", s2.id);
    printf("Name=%s\n", s2.name);
    printf("Salary=%d\n", s2.salary);
    printf("Incetive=%d\n", s2.incetive);
    printf("Target=%d\n", s2.target);
}
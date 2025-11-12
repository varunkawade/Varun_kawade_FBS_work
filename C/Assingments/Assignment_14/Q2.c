// Employee (id, name, salary)
#include <stdio.h>
#include <string.h>
struct Employee
{
    int ID;
    char Name[20];
    int Salary;
};

int main()
{
    struct Employee E1, E2;
    E1.ID = 101;
    strcpy(E1.Name, "varun");
    E1.Salary = 77000;

    printf("Enter ID of Second Employee:");
    scanf("%d", &E2.ID);
    printf("Enter Name of Second Employee:");
    scanf("%s", E2.Name);
    printf("Enter salary of Second Employee:");
    scanf("%d", &E2.Salary);

    printf("\nEmployee 1 details\n");
    printf("ID=%d\n", E1.ID);
    printf("Name=%s\n", E1.Name);
    printf("Salary=%d\n", E1.Salary);

    printf("\nEmployee 2 details\n");
    printf("ID=%d\n", E2.ID);
    printf("Name=%s\n", E2.Name);
    printf("Salary=%d\n" ,E2.Salary);
    return 0;
}
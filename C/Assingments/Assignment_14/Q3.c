// Admin (id, name, salary, allowance)
#include <stdio.h>
#include <string.h>
struct Admin
{
    int Id;
    char Name[20];
    int Salary;
    int allowance;
};

int main()
{
    struct Admin A1, A2;
    A1.Id = 101;
    strcpy(A1.Name, "varun");
    A1.Salary = 77000;
    A1.allowance=40000;

    printf("Enter Id of Second Admin:");
    scanf("%d", &A2.Id);
    printf("Enter Name of Second Admin:");
    scanf("%s", A2.Name);
    printf("Enter salary of Second Admin :");
    scanf("%d", &A2.Salary);
    printf("Enter allowance of second Admin:");
    scanf("%d",&A2.allowance);

    printf("\nAdmin 1 details\n");
    printf("ID=%d\n", A1.Id);
    printf("Name=%s\n", A1.Name);
    printf("Salary=%d\n", A1.Salary);
    printf("Allowance=%d\n",A1.allowance);

    printf("\nAdmin 2 details\n");
    printf("ID=%d\n", A2.Id);
    printf("Name=%s\n", A2.Name);
    printf("Salary=%d\n" ,A2.Salary);
    printf("Allowance=%d\n",A2.allowance);
    return 0;
}
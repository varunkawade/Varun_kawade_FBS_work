// HR (id, name, salary, commission)
#include <stdio.h>
#include <string.h>

struct HR
{
    int Id;
    char Name[20];
    int Salary;
    int commission;
};

int main()
{
    struct HR hr1, hr2;
    hr1.Id = 001;
    strcpy(hr1.Name, "Heisenberg");
    hr1.Salary = 100000;
    hr1.commission = 50;

    printf("Enter Id of Hr2:");
    scanf("%d", &hr2.Id);

    printf("Enter Name of Hr2:");
    scanf("%s", hr2.Name);

    printf("Enter Salary of Hr2:");
    scanf("%d", &hr2.Salary);

    printf("Enter commission of Hr2:");
    scanf("%d", &hr2.commission);

    printf("\nHr 1 details\n");
    printf("ID=%d\n", hr1.Id);
    printf("Name=%s\n", hr1.Name);
    printf("Salary=%d\n", hr1.Salary);
    printf("Commission=%d%%\n", hr1.commission);

    printf("\nHr 2 details\n");
    printf("ID=%d\n", hr2.Id);
    printf("Name=%s\n", hr2.Name);
    printf("Salary=%d\n", hr2.Salary);
    printf("Commission=%d%%\n", hr2.commission);
}
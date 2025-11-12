// Student (rollNo, name, marks)
#include <stdio.h>
#include <string.h>
struct student
{
    int rollno;
    char name[20];
    int marks;
};

int main()
{
    struct student s1, s2;
    s1.rollno = 101;
    strcpy(s1.name, "varun");
    s1.marks = 77;

    printf("Enter rollno:");
    scanf("%d", &s2.rollno);
    printf("Enter name:");
    scanf("%s", s2.name);
    printf("Enter makrs:");
    scanf("%d", &s2.marks);

    printf("\nStudent 1 details\n");
    printf("Rollno=%d\n", s1.rollno);
    printf("Name=%s\n", s1.name);
    printf("Marks=%d\n", s1.marks);

    printf("\nStudent 2 details\n");
    printf("Rollno=%d\n", s2.rollno);
    printf("Name=%s\n", s2.name);
    printf("Marks=%d\n", s2.marks);
    return 0;
}
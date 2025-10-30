#include <stdio.h>

void checkEligibility(int *ptr);

int main() {
    int age;
    printf("Enter your age: ");
    scanf("%d", &age);

    checkEligibility(&age); 
    return 0;
}

void checkEligibility(int *ptr) {
    int age = *ptr; 

    if (age >= 18)
        printf("Eligible for vote\n");
    else
        printf("Not Eligible for vote\n");
}

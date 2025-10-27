#include<stdio.h>

void calculateTotalSalary();

void main() {
    calculateTotalSalary();
}

void calculateTotalSalary() {
    double bs, da, ta, hra, total;
    printf("Enter basic salary: ");
    scanf("%lf", &bs);

    if(bs <= 5000) {
        da = bs * 0.10;
        ta = bs * 0.20;
        hra = bs * 0.25;
    } else {
        da = bs * 0.15;
        ta = bs * 0.25;
        hra = bs * 0.30;
    }

    total = bs + da + ta + hra;
    printf("Total Salary = %.2lf\n", total);
}

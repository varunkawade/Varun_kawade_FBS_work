#include <stdio.h>

void calculateDiscount();

void main() {
    calculateDiscount();
}

void calculateDiscount() {
    double price, finalPrice;
    char isStudent;

    printf("Enter the price: ");
    scanf("%lf", &price);

    printf("Are you a student? (y/n): ");
    scanf(" %c", &isStudent);

    if (isStudent == 'y' || isStudent == 'Y') {
        if (price > 500)
            finalPrice = price - price * 0.20;
        else
            finalPrice = price - price * 0.10;
    } else {
        if (price > 600)
            finalPrice = price - price * 0.15;
        else {
            printf("No discount applied.\n");
            return;
        }
    }

    printf("Original price: %.2lf\n", price);
    printf("Final price after discount: %.2lf\n", finalPrice);
}

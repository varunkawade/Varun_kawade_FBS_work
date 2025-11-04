// WAP to calculate selling price of book based on cost price and discount.
// ( using function and nested if- else )
#include <stdio.h>

void calculateSellingPrice(float costPrice, float discount);

int main() {
    float costPrice, discount;

    printf("Enter Cost Price of the book: ");
    scanf("%f", &costPrice);

    printf("Enter Discount percentage: ");
    scanf("%f", &discount);


    calculateSellingPrice(costPrice, discount);

    return 0;
}

void calculateSellingPrice(float costPrice, float discount) {
    float sellingPrice;

    if (discount >= 0) {
        if (discount <= 100) {
            sellingPrice = costPrice - (costPrice * discount / 100);
            printf("Selling Price of the book = %.2f\n", sellingPrice);
        } else {
            printf("Invalid discount! It cannot exceed 100%%.\n");
        }
    } else {
        printf("Invalid discount! It cannot be negative.\n");
    }
}

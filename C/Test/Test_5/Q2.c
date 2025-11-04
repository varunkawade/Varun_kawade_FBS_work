// WAP to initialize some amount in your account. Then give choice to user for deposit or
// withdraw. and display updated amount. Condition to withdraw (if the balance is less than
// 3000 display can't withdraw the amount balance is not sufficient).
// ( using function )
#include <stdio.h>

void deposit(float *balance, float amount);
void withdraw(float *balance, float amount);

int main() {
    float balance = 5000;   
    int choice;
    float amount;

    printf("Initial Balance: %.2f\n", balance);
    printf("1. Deposit\n");
    printf("2. Withdraw\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        printf("Enter amount to deposit: ");
        scanf("%f", &amount);
        deposit(&balance, amount);   
    }
    else if (choice == 2) {
        printf("Enter amount to withdraw: ");
        scanf("%f", &amount);
        withdraw(&balance, amount);
    }
    else {
        printf("Invalid choice!\n");
    }

    printf("Updated Balance: %.2f\n", balance);

    return 0;
}

void deposit(float *balance, float amount) {
    *balance = *balance + amount;
    printf("Amount deposited successfully \n");
}

void withdraw(float *balance, float amount) {
    if (*balance < 3000) {
        printf("Can't withdraw the amount, balance is not sufficient\n");
    }
    else if (amount > *balance) {
        printf("Withdrawal amount exceeds balance\n");
    }
    else {
        *balance = *balance - amount;
        printf("Amount withdrawn successfully \n");
    }
}

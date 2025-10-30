// Print armstrong numbers in the given range 1 to n.

#include <stdio.h>

int main() {
    int n = 1000; 
    int i, j, k;

    printf("Armstrong numbers from 1 to %d:\n", n);

    for (i = 1; i <= n; i++) {
        int temp = i, digits = 0, sum = 0;

        
        for (j = i; j > 0; j /= 10)
            digits++;

        for (j = i; j > 0; j /= 10) {
            int rem = j % 10;
            int power = 1;
            for (k = 1; k <= digits; k++)
                power *= rem;
            sum += power;
        }

        if (sum == i)
        
            printf("%d ", i);
    }

    return 0;
}

// Print strong numbers in the given range 1 to n.
#include <stdio.h>

int main() {
    int n = 1000;  
    int i, j, k, temp, rem, fact, sum;

    

    for (i = 1; i <= n; i++) {
        temp = i;
        sum = 0;

        
        for (j = temp; j > 0; j = j / 10) {
            rem = j % 10;
            fact = 1;
            for (k = 1; k <= rem; k++) {
                fact = fact * k;
            }

            sum = sum + fact;
        }
        if (sum == i)
            printf("%d ", i);
    }

    return 0;
}

// Print perfect numbers in the given range 1 to n.

#include<stdio.h>

int main(){
    int no = 1000;
    int sum = 0 , i = 1, j ;

    for (i = 1 ; i< no; i++){
        sum = 0 ;
        for (j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                sum = sum+j;
            }
    }
    if (sum == i) {
            printf(" %d ", i);
        }
 }
    return 0;
}
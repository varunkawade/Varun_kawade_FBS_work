// Find Sum of first and last digit of given number.
// Input: n = 12345
// Output: 6 (1 + 5)

#include<stdio.h>

int main(){
    int no = 12345 , sum , Id ;
    Id = no%10;
    while(no>10){
        no = no/10;

    }
    sum = Id + no;
    printf("The sum of first digit and last digit is %d ", sum );
    
    return 0;
}
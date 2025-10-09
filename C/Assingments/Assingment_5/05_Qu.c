// Print an inverted pyramid pattern
// Input: n = 5
// Output:

// *****
// ****
// ***
// **
// *

#include<stdio.h>

int main(){
     int n = 5;
    for (int i=1; i<=n; i++){
        for(int k=1; k<=i; k++){
            printf(" ");
        }
        
        for(int j=1;j<=6-i; j++){

         printf("* ");
        }
         printf("\n");
    }

    return 0;
}
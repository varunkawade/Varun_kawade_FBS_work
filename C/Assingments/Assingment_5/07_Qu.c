// Print a Floyd’s triangle pattern
// Input: n = 4
// Output:
// 1
// 2 3
// 4 5 6
// 7 8 9 10

#include<stdio.h>


int main(){
    int a=1;
    int n=4;
    
    for (int i = 1; i<=n;i++)
    {
        for (int j = 1; j<=i;j++){
        printf("%d",a++); 
     }
     printf("\n");
    }
    
    return 0;
}

#include<stdio.h>

int main(){
    int a,b,c,d,e;
    float sum,avg;
    printf("Enter the value: ");
    scanf("%d %d %d %d %d", &a,&b,&c,&d,&e );
    sum = a + b + c + d + e;
        avg = sum/ 5 ;
       printf("Average = %2f\n", avg );


    return 0;
}
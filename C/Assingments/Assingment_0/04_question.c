// Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>

int main(){
   int a = 10 ;
   int b = 5;
   int temp ;
   temp = a ;
   a = b;
   b = temp;
   printf("after swap:");
   printf("a = %d, b = %d", a ,b );

    return 0;
}
// Write a C program to input five numbers and find their average.
#include<stdio.h>

int main(){
     int a = 11;
     int b = 12;
     int c = 13;
     int d = 14;
     int e = 15;
      float sum , avg ;
       sum = a + b + c + d + e;
       avg = sum/ 5 ;
    
       printf("Average = %2f\n", avg );

    return 0;
}
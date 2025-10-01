// Write a C program to convert temperature from Celsius to Fahrenheit using the
// formula: F = (C *9/5) + 32
#include<stdio.h>

int main(){
     float c = 37.0 , f ;
    f = (9.0/5.0)*c + 32; 
    printf("The value in Fahrenheit is %2f/n", f) ;

    return 0;
}
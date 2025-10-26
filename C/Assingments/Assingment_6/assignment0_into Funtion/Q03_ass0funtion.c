#include<stdio.h>

int main(){
     float c,f;
     printf("Enter the Celsius temp: ");
    scanf("%f", &c);
    f = (9.0/5.0)*c + 32; 
    printf("The value in Fahrenheit is %.2f/n", f) ;
    return 0;
}
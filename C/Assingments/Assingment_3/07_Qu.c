// Find factorial of given number.
// Input: n = 5
// Output: 120
 #include<stdio.h>
 
 int main(){

    double i=1, fact=1;
     while(i<=17){
             fact=fact*i;
           i++;
 } 

  printf( "The Factorial of 5 is %lf", fact);
 
    return 0;
 }
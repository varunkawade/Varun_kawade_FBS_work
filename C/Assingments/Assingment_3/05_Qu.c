// Check the given number is Armstrong number or not..
// Input: n = 153
// Output: Armstrong

#include<stdio.h>

int main(){
    int no = 153;
    int rem , sum = 0 , temp = no; 
    while (no>0)
    {
        rem = no%10;
        sum = sum + (rem*rem*rem);
        no = no/10;
    }
     if (sum == temp)
     printf("The no is Armstrong");
     else 
     printf("The no is Not Armstorng");
    return 0;
}
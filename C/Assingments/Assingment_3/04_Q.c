// Check the given number is prime or not.
// Input: n = 7
// Output: Prime

#include<stdio.h>

int main(){
    int no = 7 , i = 2 ,flag = 1;
    while (i<=no/2)
    {
        if(no%i==0){
            flag = 0;
            break;
        }
        i++;
    } 
    if(flag==1)
    printf("Number is Prime");
    else
    printf("Number is not Prime");
    return 0;
}
// Find sum of all numbers.
#include<stdio.h>

int main(){
    int arr[5];
    int sum = 0; 
    printf("Enter Elements in array:");
    for(int i=0; i<5; i++)
    {
       scanf("%d",&arr[i]);
    }
    for(int i=0; i<5; i++)
    {
       printf("%d",arr[i]);
    }
    for(int i=0; i<5; i++)
    {
           sum=sum+arr[i];
    }
    printf("\n Sum of Array is %d",sum);
    return 0;
}
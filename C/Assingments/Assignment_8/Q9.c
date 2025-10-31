// Reverse the given array.
#include<stdio.h>

int main(){
    int arr[5];
    printf("Enter Element in arr: ");
    for(int i = 0; i<5; i++)
    {
        scanf("%d",&arr[i]);
    }

    for(int i = 4; i >= 0; i--)
        printf("%d", arr[i]);
      
    return 0;
}
// 1. Find minimum and maximum number in array.
#include<stdio.h>

int main(){
    int arr[5]={12,13,14,15,16};
    int min = arr[0] , max = arr[0];
    for(int i = 0;i<5;i++){
        printf("%d",arr[i]);
        if(arr[i]< min)
            min=arr[i];
        if (arr[i]> max)
             max=arr[i];    
    }
    printf("\n");
    printf("Minimum=%d\nMaximum=%d",min,max);
    return 0;
}
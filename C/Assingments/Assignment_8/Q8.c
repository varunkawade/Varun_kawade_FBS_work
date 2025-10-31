// Merge two arrays
#include<stdio.h>

int main(){
    int arr[5];
    int brr[5];
    int crr[10];
    printf("Enter Element in arr: ");
    for(int i = 0; i<5; i++)
    {
        scanf("%d",&arr[i]);
    }

     printf("Enter Element in brr: ");

     for(int i = 0; i<5; i++)

    {
        scanf("%d",&brr[i]);
    }

    for(int i = 0; i<5; i++)

    {
     
        crr[i]=arr[i];
    }

     for(int i = 0; i<5; i++)

    {

    crr[i+5]=brr[i];

    }
    
    printf("Merge Array is:");

    for(int i=0; i<10; i++)

    {
         printf("%d ",crr[i]);

    }
    return 0;
}
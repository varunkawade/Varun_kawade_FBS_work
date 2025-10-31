//Q5 Print alternate elements in array.
#include<stdio.h>

int main(){
   int arr[5];
    printf("Enter 5 elements in the array:");
    for(int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Alternate Elements are: ");
    for(int i=0; i<5; i+= 2){
        printf("%d ", arr[i]);

    } 
    return 0;
}
    
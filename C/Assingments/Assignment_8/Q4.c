#include <stdio.h>

int main() {
    int arr[5];
    int i;

    printf("Enter 5 elements in the array:");
    for(i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nEven numbers in the array:\n");
    for(i = 0; i < 5; i++) {
        if(arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
        }
    }

    printf("\nOdd numbers in the array:\n");
    for(i = 0; i < 5; i++) {
        if(arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}

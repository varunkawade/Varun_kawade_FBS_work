#include <stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
void showEven(int *ptr, int size);
void showOdd(int *ptr, int size);

int main() {
   int* arr = (int*) malloc (sizeof(int) * 5);
	

    printf("Enter 5 elements in the array: ");
    storeArray(arr, 5);   

    printf("\nEven numbers in the array:\n");
    showEven(arr, 5);     

    printf("\nOdd numbers in the array:\n");
    showOdd(arr, 5);      

    return 0;
}

void storeArray(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        scanf("%d", &ptr[i]);
    }
}

void showEven(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        if (ptr[i] % 2 == 0) {
            printf("%d ", ptr[i]);
        }
    }
}

void showOdd(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        if (ptr[i] % 2 != 0) {
            printf("%d ", ptr[i]);
        }
    }
}

#include<stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
void displayReverse(int *ptr, int size);

int main() {
    int* arr = (int*) malloc (sizeof(int) * 5);

    printf("Enter 5 elements in the arr: ");
    storeArray(arr, 5);

    printf("Array in reverse: ");
    displayReverse(arr, 5);

    return 0;
}

void storeArray(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        scanf("%d", &ptr[i]);
    }
}

void displayReverse(int *ptr, int size) {
    for (int i = size - 1; i >= 0; i--) {
        printf("%d ", ptr[i]);
    }
}

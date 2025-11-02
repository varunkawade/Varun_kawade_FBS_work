#include<stdio.h>

void storeArray(int *ptr, int size);
int* sortArray(int *ptr, int size);
void displayArray(int *ptr, int size);

int main() {
    int arr[5];
    int *sortedArr;

    printf("Enter 5 elements in array: ");
    storeArray(arr, 5);

    sortedArr = sortArray(arr, 5);

    printf("Array in ascending order: ");
    displayArray(sortedArr, 5);

    return 0;
}

void storeArray(int *ptr, int size) {
    for(int i = 0; i < size; i++) {
        scanf("%d", &ptr[i]);
    }
}

int* sortArray(int *ptr, int size) {
    int temp;
    for(int i = 0; i < size; i++) {
        for(int j = i + 1; j < size; j++) {
            if(ptr[i] > ptr[j]) {
                temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }
    return ptr;
}

void displayArray(int *ptr, int size) {
    for(int i = 0; i < size; i++) {
        printf("%d ", ptr[i]);
    }
}

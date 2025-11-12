#include <stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
int* mergeArray(int *a, int *b, int *c, int size);
void displayArray(int *ptr, int size);

int main() {
     int* arr = (int*) malloc(sizeof(int) * 5);
     int* brr = (int*) malloc(sizeof(int) * 5);
     int* crr = (int*) malloc(sizeof(int) * 5);
    int *merged;  

    printf("Enter 5 elements for  arr: ");
    storeArray(arr, 5);

    printf("Enter 5 elements for brr: ");
    storeArray(brr, 5);

    merged = mergeArray(arr, brr, crr, 5);

    printf("Merged Array is: ");
    displayArray(merged, 10);

    return 0;
}
void storeArray(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        scanf("%d", &ptr[i]);
    }
}
int* mergeArray(int *a, int *b, int *c, int size) {
    for (int i = 0; i < size; i++)
        c[i] = a[i];      

    for (int i = 0; i < size; i++)
        c[i + size] = b[i];   

    return c; 
}

void displayArray(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", ptr[i]);
    }
}

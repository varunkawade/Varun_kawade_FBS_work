#include <stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
void showPrime(int *ptr, int size);

int main() {
    int* arr = (int*) malloc (sizeof(int)*5);

    printf("Enter 5 elements in the array: ");
    storeArray(arr, 5);      

    printf("Prime numbers in the array are: ");
    showPrime(arr, 5);          

    return 0;
}

void storeArray(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        scanf("%d", &ptr[i]);
    }
}
void showPrime(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        int no = ptr[i];
        int flag = 0;

        if (no < 2)
            continue;

        for (int j = 2; j <= no / 2; j++) {
            if (no % j == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ", no);
    }
}

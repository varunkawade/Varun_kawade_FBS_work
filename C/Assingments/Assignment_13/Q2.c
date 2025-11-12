#include <stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
int search(int *ptr, int size, int element);

int main() {
    int* arr = (int*) malloc (sizeof(int) * 5);
	
    int element;

    printf("Enter elements in arr: ");
    storeArray(arr, 5);

    printf("Enter element to search: ");
    scanf("%d", &element);

    int res = search(arr, 5, element);

    if (res != -1)
        printf("Found at index %d\n", res);
    else
        printf("Not found\n");

    return 0;
}

void storeArray(int *ptr, int size) {
    for (int i = 0; i < size; i++)
        scanf("%d", &ptr[i]);
}

int search(int *ptr, int size, int element) {
    for (int i = 0; i < size; i++) {
        if (ptr[i] == element)
            return i;
    }
    return -1;
}

#include<stdio.h>
void storeArray(int *ptr, int size);
int* addArray(int *a, int *b, int *c, int size);

int main() {
    int arr[5];
    int brr[5];
    int crr[5];
    int *result;

    printf("Enter 5 elements for first array: ");
    storeArray(arr, 5);

    printf("Enter 5 elements for second array: ");
    storeArray(brr, 5);


    result = addArray(arr, brr, crr, 5);

    printf("Sum of arrays: ");
    for (int i = 0; i < 5; i++)
        printf("%d ", result[i]);

    return 0;
}

void storeArray(int *ptr, int size) 
{
    for (int i = 0; i < size; i++)
        scanf("%d", &ptr[i]);
}

int* addArray(int *a, int *b, int *c, int size)
 {
    for (int i = 0; i < size; i++)
        c[i] = a[i] + b[i];
    return c;
}

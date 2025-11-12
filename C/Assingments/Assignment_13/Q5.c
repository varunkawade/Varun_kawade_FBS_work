#include <stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
void showAlternate(int *ptr, int size);

int main() {
    int* arr=(int*) malloc(sizeof(int) * 5);
	

    printf("Enter 5 elements in the array: ");
    storeArray(arr, 5);  

    printf("Alternate Elements are: ");
    showAlternate(arr, 5);     
    return 0;
}

void storeArray(int *ptr, int size) 
{
    for (int i = 0; i < size; i++) 
    {
        scanf("%d", &ptr[i]);
    }
}
void showAlternate(int *ptr, int size) 
{
    for (int i = 0; i < size; i += 2) 
    {
        printf("%d ", ptr[i]);
    }
}

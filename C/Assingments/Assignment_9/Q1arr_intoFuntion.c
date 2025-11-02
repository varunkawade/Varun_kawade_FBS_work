#include<stdio.h>
void storeArray(int *ptr, int size);
void searchMinMax(int *ptr, int size, int *min, int *max);

int main()
{
    int arr[5];

    int min ,max;

    printf("Enter element in arr:");

    storeArray(arr, 5);

    searchMinMax(arr, 5, &min, &max);


    printf("\nMinimum=%d\nMaximum=%d\n",min,max);
    return 0;
}

 void storeArray(int* ptr ,int size)
{
    for(int i=0; i<size; i++)
    scanf("%d",&ptr[i]);
}

void searchMinMax(int *ptr, int size, int *min, int *max) 
{
    *min = *max = ptr[0];

    for(int i = 0;i<size;i++){
        
        if(ptr[i]< *min)
            *min=ptr[i];
        if (ptr[i]> *max)
             *max=ptr[i];    
    }
}

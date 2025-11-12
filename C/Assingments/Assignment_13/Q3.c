#include<stdio.h>
#include<stdlib.h>
void storeArray(int *ptr, int size);
int sumofArray(int*ptr, int size);
int main(){
    int* arr = (int*) malloc (sizeof(int) * 5);
	
    int total ;
     printf("Enter element in arr:");

     storeArray(arr, 5);

     total = sumofArray(arr, 5);

     printf("Sum of array = %d\n", total);

    return 0;
}

void storeArray(int *ptr, int size) 
{
    for (int i = 0; i < size; i++)
        scanf("%d", &ptr[i]);
}
int sumofArray(int*ptr ,int size)
{
     int sum=0;
     for(int i=0; i<size; i++)
    {
           sum=sum + ptr[i];
          
    }
    return sum;
}
// check if array is palindrome or not(using function)
#include<stdio.h>
void storeArray(int*, int);
void ispalindromeArr(int*, int);
void main()
{
	int arr[5];
	printf("Enter Elements in Array: ");
	storeArray(arr,5);
	
	ispalindromeArr(arr,5);
}
void storeArray(int* ptr, int size)
{
	for(int i=0; i<size; i++)
	{
		scanf("%d",&ptr[i]);
	}
}
void ispalindromeArr(int*ptr, int size)
{
	int flag=0;
	for(int i=0, j=size-1; i<size/2; i++,j--)
	{
	   if( ptr[i] !=ptr[j])
	   {
	   	 flag=1;
	   }
	}
	
	if(flag==0)
	printf("Pallindrome");
	else
	printf("Not Pallindrome");
}


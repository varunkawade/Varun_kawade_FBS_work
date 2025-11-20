// write a program to aceepetion array and exchange the dataof Xth postion to Yth position
//  eg arr[]={11,23,30,4,21,45,50}
//  xth postion=3
//  yth postion=5 
//  o/p= arr[]={11,23,21,4,30,45,50}


void swapXY(int arr[], int n, int x, int y);
#include <stdio.h>


int main()
{
    int arr[10], n, x, y;

    printf("Enter size: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter X position: ");
    scanf("%d", &x);

    printf("Enter Y position: ");
    scanf("%d", &y);

    swapXY(arr, n, x, y);

}
void swapXY(int arr[], int n, int x, int y)
{
    for(int i = 0; i <n; i++)
	{
		if(i = x)
			{
				int temp = arr[i];
				arr[i] = arr[y];
				arr[y] = temp;
				break;
			}
	}
	  printf("Afterswaping ");
	for(int i = 0; i < 7; i++)
	{
		printf(" %d ",arr[i]);
	}
}



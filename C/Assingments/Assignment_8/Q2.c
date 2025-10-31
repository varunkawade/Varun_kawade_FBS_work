// Search the given number in array.
#include<stdio.h>

int main(){
    int arr[5];
    int no, index=-1;
    printf("Enter Elements in array:");
    for(int i=0; i<5; i++)
    {
       scanf("%d",&arr[i]);
    }

    for(int i=0; i<5; i++)
    {
       printf("%d ",arr[i]);
    }
    printf("\n Enter Element you want search:");

    scanf("%d",&no);

    for(int i=0; i<5; i++)
    {
    if(arr[i]== no){
        index = i;
        break;
    }
 } 
  if(index == -1)
  printf(" Element not Found");
  else
  printf(" Elemnt Found at the %d index",index);
    return 0;
}
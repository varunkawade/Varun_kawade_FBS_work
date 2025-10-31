// // Accept array and print only prime numbers of array.
#include<stdio.h>

int main(){
    int arr[5];
    int flag=0;

    printf("Enter 5 elements in the array:");
    for(int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i<5; i++) 
    {
       int no=arr[i];
       for(int j=2; j<=no/2; j++)
       {
          if(arr[i]%j==0)
          {
            flag=1;
            break;
          }
       }
         if(flag==0){
         printf("Number is Prime %d ",arr[i]);}
        
    } 

}

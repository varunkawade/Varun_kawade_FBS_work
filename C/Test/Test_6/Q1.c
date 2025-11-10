// write a program in c for to find common elements at two arrays
// eg. arr= 1 2 3 4 5
//     brr= 1 6 7 3 2
//     o/p=1 2 3
#include<stdio.h>

int main(){
    int arr[5]={1,2,3,4,5};
    int brr[5]={1,6,7,3,2};
    for (int i = 0; i<arr[i];i++){
    for (int j =0;j<brr[i];j++){
        if(arr[i]==brr[j]){
        printf("%d ",arr[i]);
        break;
    }
  }
   }
    return 0;
}
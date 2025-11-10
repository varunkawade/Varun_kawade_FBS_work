// wirte a program in c to find two maximum number in array ?
 #include<stdio.h>
 
 int main(){
    int arr[5]={1,2,3,4,5};
    int secondmax = arr[0],max = arr[0];
    for(int i = 0;i<5;i++){
        if (arr[i]> max)
             secondmax=max;
             max = arr[i]; 
             
    }
    printf("\n");
    printf("Maximum=%d %d",max,secondmax);
    return 0;
 }
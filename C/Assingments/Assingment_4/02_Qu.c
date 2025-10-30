// Print prime numbers in the given range 1 to n.

#include<stdio.h>

int main(){
     
    for  (int k = 1; k<= 1000; k++){
        int no = k, flag = 0; 
    
    for (int i = 2; i<no; i++){
        if(no%i==0)
        {
            flag = 1;
            break;
        }
    } if(flag == 0)
    printf(" %d ",no);
}
    return 0;
}
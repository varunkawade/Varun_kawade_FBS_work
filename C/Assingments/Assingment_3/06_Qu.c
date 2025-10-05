// Check the given number is Perfect number or not.
// Input: n = 28
// Output: Perfect

 #include<stdio.h>
 
 int main(){
    int no = 28,sum = 0 ;
    int i = 1;
    while(i<=no/2)
    {
        if(no%i==0){
            sum = sum + i ;
        
        }
        i++;
    }
    if(sum == no){
        printf("%d The number is perfect ", no);
    }   
    else{
    printf("%d The number is not perfect", no);
    }
    return 0;
 }
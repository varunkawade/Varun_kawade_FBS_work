
#include<stdio.h>

int main(){
    int a, square , cube;
    printf("Enter the Number: ");
    scanf("%d", &a);
    square = a*a;
    cube = a*a*a;
    printf("Number:%d\n", a);
    printf("square:%d\n", square);
    printf("cube:%d\n", cube);
    return 0;
}
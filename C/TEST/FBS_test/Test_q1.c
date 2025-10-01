#include<stdio.h>

int main(){
    int hr= 2,min = 30 , sec = 15;
    int total_seconds;
    total_seconds = (hr*3600)+(min*60)+sec;
    printf("time = %d:%d:%d\n", hr,min,sec);
    printf("toatal_seconds = %d\n", total_seconds);
    return 0;
}
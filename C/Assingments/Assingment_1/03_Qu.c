#include<stdio.h>

int main(){
    int year = 2000;
	if(year%4==0 && year%100!=0 || year%400==0){
		printf("Leap year");
	}
	else{
		printf("Not Leap year");
	}
    return 0;
}
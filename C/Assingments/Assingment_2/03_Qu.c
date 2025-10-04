#include<stdio.h>

int main(){
    int a = 20, b = 40, c = 70;
	if(a>b)
	if(a>c)
		printf("a is greater");	
		else 
		printf("c is greater");
		else 
	    if(b>c)
		printf("b is greater");
	    else 
		printf("c is greater");
    return 0;
}
#include<stdio.h>

int main(){
    
	int side1 = 6, side2 = 1, side3 = 5;
	if(side1==side2 && side2==side3)
		printf("The triangle is equilateral");
	      else if(side1==side2 || side1==side3 && side2==side3)
	        printf("isoscles");
	          else 
	            printf("scalen");
    return 0;
}
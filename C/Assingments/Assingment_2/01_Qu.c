// Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
// desired operations.

#include<stdio.h>

int main(){
    int a =9, b =5;
	int ch =5;
	if(ch==1)
		printf("Addition %d and %d is : %d",a,b ,a+b);
	else if(ch==2)
	   	printf("Substraction of %d and %d is : %d",a,b,a-b);
	   else if(ch==3)
	   	printf("Div of %d and %d is : %d",a,b,a/b);
	   else if(ch==4)
	   	printf("Mul of %d and %d is : %d",a,b,a*b);
	   else if(ch==5)
	   	printf("Mod of %d and %d is : %d",a,b,a%b);
	   else
	   printf("invalid");

    return 0;
}
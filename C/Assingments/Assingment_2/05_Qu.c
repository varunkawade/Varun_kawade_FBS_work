    //Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.

#include<stdio.h>
 
 int main(){
	double price =700, fprice;
	char ch ='y';
	if(ch=='y')
	{
		if(price>=500)
		{
			fprice = price-price*0.20;
			printf("The price is %lf and discount is 20% , Final price : %lf", price, fprice);
		}
		else
		{
			fprice = price-price*0.10;
			printf("%lf", fprice);
		}
	}
	else
	{
	   	if(price>=600)
	   	{
	   		fprice = price-price*0.15;
	   		printf("%lf", fprice);
		   }
		   else
		   {
		   	printf("Not Discount");
		   }
	}

    return 0;
 }
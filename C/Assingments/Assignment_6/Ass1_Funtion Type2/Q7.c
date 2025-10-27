#include<stdio.h>

double salary();

void main()
{
	printf("%2lf", salary());
}

double salary()
{
	double basic , da,ta,hra  ;
	printf("Enter basic \n");
	scanf("%lf", &basic);
	
	double total;
	
	if(basic <=5000)
	{
		da =basic*0.10;
		ta =basic*0.20;
		hra =basic*0.25;
	}
	else
	{
		da =basic*0.15;
		ta =basic*0.25;
		hra =basic*0.30;
	}
	
	return basic+da+ta+hra;
	
}
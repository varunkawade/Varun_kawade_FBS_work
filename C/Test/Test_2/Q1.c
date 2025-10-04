#include<stdio.h>

int main(){
    int units = 100;
	if(units>=1 && units<=50)
	{
		printf("30 rs/unit");
	}
	 else
	{
	   if(units>=51 && units<=150)
	   {
	   	printf("40 rs/unit");
	   }
	   else 
	   {
	   	printf("50 rs/unit");
	   }
			
	}

    return 0;
}
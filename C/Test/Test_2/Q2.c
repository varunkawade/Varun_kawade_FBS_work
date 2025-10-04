#include<stdio.h>

int main(){
    int no = 2 ;
	if(no>=1 && no<=9)
	{
		printf("%d No is Positive", no);
	}
	else
	{
		if(no<0)
		{
			printf("%d No is Negative", no);
		}
		else
		{
			printf("%d No is Neutral", no);
		}
	}

    return 0;
}
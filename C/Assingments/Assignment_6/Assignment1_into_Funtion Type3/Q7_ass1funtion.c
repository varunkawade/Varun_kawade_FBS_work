#include<stdio.h>
void calculateTotalSalary(double bs);

int main(){
    double bs;
    printf("Enter basic salary :");
    scanf("%lf",&bs);
    calculateTotalSalary(bs);
    return 0;
}
void calculateTotalSalary(double bs){
    double da,ta,hra,total;
    if(bs<=5000){
		da = bs*0.10;
		ta = bs*0.20;
		hra = bs*0.25;
	
    }else{
        da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.30;
    }
	total = bs+da+ta+hra;
	printf("Total Salary = %2lf",total);
}
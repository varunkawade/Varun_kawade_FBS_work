// Distance ( feet, inch)
#include<stdio.h>
#include<string.h>
struct Distance
{
   int feet;
   float inch;
};
int main()
{
 struct Distance D1,D2;
  D1.feet=5;
  D1.inch=5.4;

  printf("Enter D2 distance feet:");
  scanf("%d",&D2.feet);

  printf("Enter D2 distance inch:");
  scanf("%f",&D2.inch);


  printf("\nD1 Details\n");
  printf("Feet=%d\n",D1.feet);
  printf("Inch=%.2f\n",D1.inch);

  printf("\nD2 Details\n");
  printf("Feet=%d\n",D2.feet);
  printf("Inch=%.2f\n",D2.inch);

}
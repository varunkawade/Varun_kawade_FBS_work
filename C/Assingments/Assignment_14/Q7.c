// Time (hour, min, sec)
#include<stdio.h>
#include<string.h>
typedef struct Time
{  
    int hour;
    int min;
    int sec;  
}Time;
int main()
{
    struct  Time T1 ,T2;
    T1.hour=1;
    T1.min=30;
    T1.sec=5;

    printf("Enter Hour in T2:");
    scanf("%d",&T2.hour);
  
    printf("Enter Min in T2:");
    scanf("%d",&T2.min);

    printf("Enter Sec in T2:");
    scanf("%d",&T2.sec);


    printf("\nTime T1\n");
    printf("Hour=%d\n",T1.hour);
    printf("Min=%d\n",T1.min);
    printf("Sec=%d\n",T1.sec);

    printf("\nTime T2\n");
    printf("Hour=%d\n",T2.hour);
    printf("Min=%d\n",T2.min);
    printf("Sec=%d\n",T2.sec);
}
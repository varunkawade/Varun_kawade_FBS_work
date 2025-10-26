#include<stdio.h>

int main(){
    int s1, s2, s3, s4 , s5 ;
    int total;
    float percentage;
    printf("Enter the Subjects marks: ");
    scanf("%d,%d,%d,%d,%d", &s1,&s2,&s3,&s4,&s5);

    total = s1 + s2 + s3 + s4 + s5;
    percentage = (total / 5.0);

    printf("Total Marks = %d\n", total);
    printf("Percentage = %.2f\n", percentage);


    return 0;
}
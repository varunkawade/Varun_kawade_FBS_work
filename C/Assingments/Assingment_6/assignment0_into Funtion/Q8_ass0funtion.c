#include<stdio.h>

int main(){
    int length ,width;
    int perimeter;
    printf("Enter the lenght,width: ");
    scanf("%d,%d", &length,&width);
    perimeter = 2* (length + width);

 printf("Perimeter of rectangle =%d\n",perimeter);


    return 0;
}
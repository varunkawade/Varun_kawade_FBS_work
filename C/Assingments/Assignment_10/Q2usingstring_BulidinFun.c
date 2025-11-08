// strcpy()
#include<stdio.h>
#include<string.h>
int main(){
    char str[]="Varun";
    char ptr[50];
    
    strcpy(ptr,str);

    printf("%s",ptr);

    return 0;
}
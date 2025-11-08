// strncpy()
#include<stdio.h>
#include<string.h>
int main(){
    char str[]="Varun kawade";
    char ptr[50];
    
    strncpy(ptr,str,5);
     ptr[50] = '\0';
    printf("%s",ptr);

    return 0;
}
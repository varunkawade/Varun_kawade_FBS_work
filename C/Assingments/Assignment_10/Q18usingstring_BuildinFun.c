// strdup()
#include<stdio.h>
#include<string.h>
int main(){
    char a []="varun";
    char* b = strdup(a);
    printf("%s",b);
    return 0;
}
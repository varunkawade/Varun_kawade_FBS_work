// WAP to Form a New String where the First Character and the Last Character have been Exchanged
#include<stdio.h>
#include<string.h>
char* swapFirstLast(char* str);
int main(){
    char str[6];
    
    printf("Enter the string:");
    gets(str);
    
    char* result = swapFirstLast(str); 
    printf("String after swapping: %s\n", result);

}   
char* swapFirstLast(char* str){
    char temp;
    int len;
    len=strlen(str);
    if(len>1){
    temp=str[0];
    str[0]=str[len-1];
    str[len-1]= temp;
}

    return str;
}
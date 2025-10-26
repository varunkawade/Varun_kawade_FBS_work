#include<stdio.h>
void CheckCase(char ch);
int main(){
    char ch;
    printf("Enter any character:");
    scanf("%c,&ch");
    CheckCase(ch);
    return 0;
}
void CheckCase(char ch){
    if(ch>='A'&&ch<='Z')
		printf("%c is Uppercase",ch);
	else
		printf("%c is Lowercase",ch);
	
}
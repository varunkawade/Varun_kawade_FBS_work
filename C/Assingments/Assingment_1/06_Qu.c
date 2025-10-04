// Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

int main(){
    char ch = 'E';
	if(ch>='A'&&ch<='Z'){
		printf("Uppercase");
	}
	else{
		printf("Lowercase");
	}
    return 0;

}

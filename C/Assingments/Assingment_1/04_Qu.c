#include<stdio.h>

int main(){
    char ch = 'U';
	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' ||
	   ch=='I'|| ch=='O'|| ch=='U'){
		printf("The char is vowel");
	}
	else{
		printf("The char is consonant");
	}
    return 0;
}
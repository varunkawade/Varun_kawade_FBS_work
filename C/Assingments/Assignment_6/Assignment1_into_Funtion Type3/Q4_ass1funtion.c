#include<stdio.h>
void checkVowelOrConsonat(char ch);
int main(){
    char ch;
    printf("Enter any character:");
    scanf("%c",&ch);
    checkVowelOrConsonat(ch);
    return 0;
}
void checkVowelOrConsonat(char ch){
    if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' ||
	   ch=='I'|| ch=='O'|| ch=='U')
		 printf("%c is a vowel\n", ch);
	else
		printf("%c is a consonant\n", ch);
	
}
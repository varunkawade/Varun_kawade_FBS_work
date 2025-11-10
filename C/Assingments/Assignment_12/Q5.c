// WAP to Count the Number of Vowels in a String
#include<stdio.h>
#include<string.h>
int countvowel(char* str);
int main(){
    char str[20];
    int count;

    printf("Enter the string: ");
    gets(str);
    count = countvowel(str);
    printf("Number of vowels: %d",count); 
    return 0;
}
int countvowel(char* str)
{
      int i, count = 0;
      for(i = 0; str[i]!='\0';i++)
      {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' ||
            str[i] == 'o' || str[i] == 'u' || str[i] == 'A' ||
            str[i] == 'E' || str[i] == 'I' || str[i] == 'O' ||
            str[i] == 'U') {
            count++;
        }
    }

    return count;

}

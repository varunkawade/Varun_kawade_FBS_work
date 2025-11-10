#include<stdio.h>
#include<string.h>
int main(){
  int rev;
  char str [10];
  char org [10];
  printf("Enter a string:");
    scanf("%s",str);
    strcpy(org,str);
    strrev(str);
    int res = strcmp(str,org);
    if(res==0){
      printf("palindrom %s ",str);
    }
    else{
      printf("not palindrom %s ",str);
    }

  return 0;
}
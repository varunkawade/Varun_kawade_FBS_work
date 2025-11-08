// strcmp()
#include<stdio.h>
#include<string.h>
int main(){
    char a[]="abc";
    char b[]="abd";

    printf("%d", strcmp(a, b));


    return 0;
}


// strncmp()
// #include <stdio.h>
// #include <string.h>

// int main() {
//     char a[] = "Hello";
//     char b[] = "Help";
//     printf("Compare first 3 chars = %d\n", strncmp(a, b, 3));
//     return 0;
// }

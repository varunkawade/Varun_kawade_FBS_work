// WAP to add alternate no form given range 
// eg ip: start = 1 end = 5
// op: sum = 9



#include <stdio.h>

int main() {
    int start , end , sum = 0;
     printf("Enter start and end values: ");
    scanf("%d %d", &start, &end);
    for (int i = start; i <= end; i ++) {
        if(i%2==1) 
        sum = sum + i;
    }

    printf("Sum = %d\n", sum);
    return 0;
}
// for (int i = start; i <= end; i++) {
//         if (i % 2 == 1)
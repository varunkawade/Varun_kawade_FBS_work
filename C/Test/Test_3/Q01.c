// WAP print even & odd numbers in given range 
// eg i/p: Start = 10 , end = 25
//  o/p: odd:11,13,15,17,19,21,23,25
//  eg i/p : start = 1 , end = 15
//  o/p: even 2,4,6,8,10,12,14

#include <stdio.h>

void printOdd(int start, int end);
void printEven(int start, int end);

int main() {
    int startOdd, endOdd;
    int startEven, endEven;
    printf("Enter start and end values for ODD numbers: ");
    scanf("%d %d", &startOdd, &endOdd);
    printf("Enter start and end values for EVEN numbers: ");
    scanf("%d %d", &startEven, &endEven);
    printOdd(startOdd, endOdd);
    printEven(startEven, endEven);

    return 0;
}

void printOdd(int start, int end) {
    printf("\n Odd numbers: ");
    for (int i = start; i <= end; i++) {
        if (i % 2 == 1)
            printf("%d ", i);
    }
}
void printEven(int start, int end) {
    printf("\n Even numbers: ");
    for (int j = start; j <= end; j++) {
        if (j % 2 == 0)
            printf("%d ", j);
    }
}


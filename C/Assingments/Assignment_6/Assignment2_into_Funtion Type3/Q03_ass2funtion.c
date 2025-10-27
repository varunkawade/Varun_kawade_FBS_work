#include <stdio.h>

void findGreatest(int a, int b, int c);

int main() {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    findGreatest(a, b, c);

    return 0;
}


void findGreatest(int a, int b, int c) {
    if (a > b) {
        if (a > c)
            printf("a (%d) is greatest\n", a);
        else
            printf("c (%d) is greatest\n", c);
    } else {
        if (b > c)
            printf("b (%d) is greatest\n", b);
        else
            printf("c (%d) is greatest\n", c);
    }
}

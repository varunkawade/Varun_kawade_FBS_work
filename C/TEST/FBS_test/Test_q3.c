#include <stdio.h>

int main() {

int num = 223410; // hardcoded value

int last_two;

last_two = num % 100; // Get last 2 digits

printf("Number = %d\n", num);

printf("Last two digits = %02d\n", last_two);

return 0;

}
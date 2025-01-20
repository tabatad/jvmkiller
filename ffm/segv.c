#include <stdio.h>

void segv() {
    int *ptr = NULL;
    *ptr = 1;
}
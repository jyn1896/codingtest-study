#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int pizza = 1;
    
    while ((6*pizza) % n != 0) {
        pizza ++;
    }
    
    return pizza;
}
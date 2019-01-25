#include "primos.h"

void primo (int valor) {
    int numero, nPrimos = 0;
    for(numero = 1; numero < valor; numero++) {
        if (valor % numero == 0){
            nPrimos++;
        }
    }
    if (nPrimos == 1){
        printf("%d \n",valor);
    }
}

void conta (int numero) {
    int valor;
    for (valor = 1; valor <= numero; valor++) {
        primo(valor);
    }
}